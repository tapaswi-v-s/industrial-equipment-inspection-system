package com.system.models;

public class Equipment {
    int id;
    String tag;
    String equipmentName;
    int isWorking;
    String remark;
    int plantId;

    public Equipment(int id, String tag, String equipmentName, int isWorking, String remark, int plantId) {
        this.id = id;
        this.tag = tag;
        this.equipmentName = equipmentName;
        this.isWorking = isWorking;
        this.remark = remark;
        this.plantId = plantId;
    }

    public Equipment(String tag, String equipmentName, int isWorking, String remark, int plantId) {
        this.id = -1;
        this.tag = tag;
        this.equipmentName = equipmentName;
        this.isWorking = isWorking;
        this.remark = remark;
        this.plantId = plantId;
    }
    

    public Equipment(String tag, String equipmentName, int plantId) {
        this.id = -1;
        this.tag = tag;
        this.equipmentName = equipmentName;
        this.isWorking = -1;
        this.remark = null;
        this.plantId = plantId;
    }
    
    public int getId() {
        return id;
    }

    public String getTag() {
        return tag;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public int getIsWorking() {
        return isWorking;
    }

    public String getRemark() {
        return remark;
    }

    public int getPlantId() {
        return plantId;
    }

    public void setIsWorking(int isWorking) {
        this.isWorking = isWorking;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    
    
}
