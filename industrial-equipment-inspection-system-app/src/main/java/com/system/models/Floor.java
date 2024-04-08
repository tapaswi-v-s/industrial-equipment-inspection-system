package com.system.models;

public class Floor {
    private final Integer id;
    private final String name;

    public Floor(Integer id, String name) {
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
