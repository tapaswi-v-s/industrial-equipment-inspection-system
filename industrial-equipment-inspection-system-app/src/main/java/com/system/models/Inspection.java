package com.system.models;

public class Inspection {
    private final Integer id;
    private final String name;

    public Inspection(Integer id, String name) {
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
