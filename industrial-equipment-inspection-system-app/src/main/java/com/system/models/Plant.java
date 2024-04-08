package com.system.models;

public class Plant {
    private final Integer id;
    private final String name;

    public Plant(Integer id, String name) {
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
