package com.system.models;

public class InspectionFrequency {
    private final Integer id;
    private final String frequency;

    public InspectionFrequency(Integer id, String frequency) {
        this.id = id;
        this.frequency = frequency;
    }

    public Integer getId(){
        return id;
    }

    public String getFrequency(){
        return frequency;
    }
}
