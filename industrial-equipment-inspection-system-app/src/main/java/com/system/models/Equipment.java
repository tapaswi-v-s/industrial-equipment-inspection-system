package com.system.models;

import java.util.List;

public class Equipment {
    int id;
    String tag;

    String equipmentType;
    String plant;
    String section;
    String floor;
    String location;
    List<EquipmentAttribute> attributes;

    public Equipment(int id, String tag, String equipmentType, String plant,
                     String section, String floor, String location, 
                     List<EquipmentAttribute> attributes) {
        this.id = id;
        this.tag = tag;
        this.equipmentType = equipmentType;
        this.plant = plant;
        this.section = section;
        this.floor = floor;
        this.location = location;
        this.attributes = attributes;
    }
    public Equipment(int id, String tag, String plant,
                     String section, String floor, String location) {
        this.id = id;
        this.tag = tag;
        this.equipmentType = null;
        this.plant = plant;
        this.section = section;
        this.floor = floor;
        this.location = location;
    }

    public void setAttributes(List<EquipmentAttribute> attributes) {
        this.attributes = attributes;
    }

    public int getId() {
        return id;
    }

    public String getTag() {
        return tag;
    }

        public String getEquipmentType() {
        return equipmentType;
    }

    public String getPlant() {
        return plant;
    }

    public String getSection() {
        return section;
    }

    public String getFloor() {
        return floor;
    }

    public String getLocation() {
        return location;
    }

    public List<EquipmentAttribute> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", plant='" + plant + '\'' +
                ", section='" + section + '\'' +
                ", floor='" + floor + '\'' +
                ", location='" + location + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
