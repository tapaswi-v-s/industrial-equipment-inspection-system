package com.system.evaluator;

import com.system.plant_manager.*;
import com.system.models.*;
import com.system.utils.DatabaseHelper;

import java.util.List;

public class EvaluatorController {


    List<EquipmentType> fetchEquipmentTypes(){
        return DatabaseHelper.getInstance().fetchEquipmentTypes();
    }

    List<Location> fetchLocations(){
        return DatabaseHelper.getInstance().fetchLocations();
    }

    List<Section> fetchSections(){
        return DatabaseHelper.getInstance().fetchSections();
    }

    List<Floor> fetchFloors(){
        return DatabaseHelper.getInstance().fetchFloors();
    }

    List<DataType> fetchDataTypes(){
        return DatabaseHelper.getInstance().fetchTypes();
    }

    List<Plant> fetchPlants(){
        return DatabaseHelper.getInstance().fetchPlants();
    }

    List<Equipment> fetchPlantEquipments(int plantId){
        return DatabaseHelper.getInstance().fetchPlantEquipments(plantId);
    }
    
    boolean deletePlant(int plantId){
        return DatabaseHelper.getInstance().deletePlant(plantId);
    }
    
    boolean updatePlant(Plant plant){
        return DatabaseHelper.getInstance().updatePlant(plant);
    }
    
    boolean addPlant(Plant plant){
        return DatabaseHelper.getInstance().insertPlant(plant);
    }

    boolean addEquipment(Equipment equipment){
        return DatabaseHelper.getInstance().addEquipment(equipment);
    }
    
    List<Inspection> fetchActiveInspections(){
        return DatabaseHelper.getInstance().fetchActiveInspections();
    }
    
    List<Inspection> fetchPastInspections(){
        return DatabaseHelper.getInstance().fetchPastInspections();
    }
   
    boolean updateInspection(Inspection i){
        return DatabaseHelper.getInstance().updateInspection(i);
    }
}
