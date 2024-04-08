package com.system.models;

public class EquipmentType {
    private final Integer id;
    private final String name;

    public EquipmentType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
