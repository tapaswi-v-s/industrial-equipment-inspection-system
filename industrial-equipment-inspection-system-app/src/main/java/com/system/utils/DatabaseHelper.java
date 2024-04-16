package com.system.utils;

import com.system.models.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseHelper {

    private static DatabaseHelper single_instance = null;
    private Connection connection;

    public DatabaseHelper() {}

    public static synchronized DatabaseHelper getInstance(){
        if (single_instance == null)
            single_instance = new DatabaseHelper();

        return single_instance;
    }

    public void init(){
        makeConnection();
    }

    private void makeConnection(){
        try {
            String connectionString = "jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5694823?useSSL=false";
            connection = DriverManager
                    .getConnection(connectionString, "sql5694823","u1junkFtQf");
            System.out.println("============= Database Connection Established =============");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getPlantEquipments(int plantId, int equipmentId){
        try {
            // Calling the stored procedure
            CallableStatement cs = connection.prepareCall("CALL get_plant_equipments(?, ?)");
            cs.setInt(1, plantId); // Setting the parameters 1 (?)
            cs.setInt(2, equipmentId); // Setting the parameters 2 (?)
            ResultSet rs = cs.executeQuery(); // Executing the query
            while (rs.next()){
                // Fetching the results
                Equipment e = new Equipment(rs.getInt("Id"), rs.getString("Tag"),
                        rs.getString("Plant"), rs.getString("Section"),
                        rs.getString("Floor"), rs.getString("Location"));

                System.out.println(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    ResultSet fetchData(String query){
        try {
            return connection.createStatement().executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        }

        boolean executeDeleteQuery(String query, int id){
            try {
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setInt(1, id);
                return statement.executeUpdate() > 0;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return false;
        }

    public List<EquipmentType> fetchEquipmentTypes(){
        String query = "SELECT * FROM sql5694823.equipment_type;";
        ResultSet rs = fetchData(query);
        List<EquipmentType> equipmentTypes = new ArrayList<>();
        try {
            while(rs.next()){
                equipmentTypes.add(new EquipmentType(rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return equipmentTypes;
    }

    public List<Location> fetchLocations(){
        String query = "SELECT * FROM sql5694823.location;";
        ResultSet rs = fetchData(query);
        List<Location> locations = new ArrayList<>();
        try {
            while(rs.next()){
                locations.add(new Location(rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return locations;
    }

    public List<Section> fetchSections(){
        String query = "SELECT * FROM sql5694823.section;";
        ResultSet rs = fetchData(query);
        List<Section> sections = new ArrayList<>();
        try {
            while(rs.next()){
                sections.add(new Section(rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sections;
    }

    public List<Floor> fetchFloors(){
        String query = "SELECT * FROM sql5694823.floor;";
        ResultSet rs = fetchData(query);
        List<Floor> floors = new ArrayList<>();
        try {
            while(rs.next()){
                floors.add(new Floor(rs.getInt("id"),
                        rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return floors;
    }

    public List<DataType> fetchTypes(){
        String query = "SELECT * FROM sql5694823.data_type;";
        ResultSet rs = fetchData(query);
        List<DataType> dataTypes = new ArrayList<>();
        try {
            while(rs.next()){
                dataTypes.add(new DataType(rs.getInt("id"),
                        rs.getString("type")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dataTypes;
    }

     public List<Inspection> fetchinspection(){
        String query = "SELECT * FROM sql5694823.inspection;";
        ResultSet rs = fetchData(query);
        List<Inspection> inspections = new ArrayList<>();
        try {
            while(rs.next()){
                inspections.add(new Inspection(rs.getInt("id"),rs.getString("inspection_date"),
                rs.getString("remark"),rs.getInt("plant_id"),rs.getInt("inspector_id"),
                rs.getInt("evaluator_id"),rs.getString("evaluator_remark")));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return inspections;
    }
    
    
    public List<Plant> fetchPlants(){
        String query = "SELECT * FROM sql5694823.plant;";
        ResultSet rs = fetchData(query);
        List<Plant> plants = new ArrayList<>();
        try {
            while(rs.next()){
                plants.add(new Plant(rs.getInt("id"),
                        rs.getString("Name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return plants;
    }

    public boolean deletePlant(int id){
        String query = "DELETE FROM sql5694823.plant where id = ?";
        return executeDeleteQuery(query, id);
    }
    

    public boolean updatePlant(Plant plant){
        String query = "UPDATE sql5694823.plant SET Name = ? WHERE id = ?";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, plant.getName());
            statement.setInt(2, plant.getId());
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    

    public boolean insertPlant(Plant plant){
        String query = "INSERT INTO sql5694823.plant (Name) VALUES (?)";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query);
            statement.setString(1, plant.getName());
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addEquipment(Equipment equipment){
        String query = "INSERT INTO sql5694823.equipment " +
                "(tag_number, equipment_type_id, plant_id," +
                " section_id, floor_id, location_id)" +
                " VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, equipment.getTag());
            statement.setInt(2, Integer.parseInt(equipment.getEquipmentType()));
            statement.setInt(3, Integer.parseInt(equipment.getPlant()));
            statement.setInt(4, Integer.parseInt(equipment.getSection()));
            statement.setInt(5, Integer.parseInt(equipment.getFloor()));
            statement.setInt(6, Integer.parseInt(equipment.getLocation()));
            int affectedRows = statement.executeUpdate();
            if(affectedRows == 0){
                throw new SQLException("Equipment addition failed....");
            }else{
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int id = generatedKeys.getInt(1);
                        System.out.println("Equipment ID: "+id);
                        return addEquipmentAttributes(id, equipment.getAttributes());
                    }
                    else {
                        throw new SQLException("Adding equipment failed, no ID obtained.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addEquipmentAttributes(int eqptId, List<EquipmentAttribute> attributes){
        boolean done = false;
        for(EquipmentAttribute attr : attributes){
            String query = "INSERT INTO sql5694823.equipment_attribute " +
                    "(name, is_editable, data_type_id) " +
                    "VALUES (?, ?, ?);";
            PreparedStatement statement;
            try{
                statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                statement.setString(1, attr.getName());
                statement.setInt(2, attr.isEditable() ? 1 : 0);
                statement.setInt(3, attr.getDataType().getId());
                int affectedRows = statement.executeUpdate();
                if(affectedRows == 0){
                    throw new SQLException("Equipment attribute failed....");
                }else{
                    try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int attrId = generatedKeys.getInt(1);
                            System.out.println("    Attribute ID: "+attrId);
                            done = addAttributeMapping(eqptId, attrId, attr.getValue().toString());
                        }
                        else {
                            throw new SQLException("" +
                                    "Adding Equipment attribute failed, no ID obtained.");
                        }
                    }
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return done;
    }

    boolean addAttributeMapping(int eqptID, int attrID, String value){
        String query = "INSERT INTO sql5694823.equipment_attribute_mapping " +
                "(equipment_id, attribute_id, value) " +
                "VALUES (?, ?, ?);";
        PreparedStatement statement;
        try{
            statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, eqptID);
            statement.setInt(2, attrID);
            statement.setString(3, value);
            System.out.println("        Mapping added");
            return statement.executeUpdate() > 0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }



}
