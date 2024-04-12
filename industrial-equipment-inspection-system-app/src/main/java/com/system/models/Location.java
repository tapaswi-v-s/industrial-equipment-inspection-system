package com.system.models;

public class Location {
    private final Integer id;
    private final String name;

    public Location(Integer id, String name) {
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
