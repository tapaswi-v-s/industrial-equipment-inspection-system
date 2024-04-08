package com.system.utils;

import com.system.models.Equipment;

import java.sql.*;

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


}
