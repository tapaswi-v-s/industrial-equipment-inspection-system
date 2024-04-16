package com.system.models;

public class DataType {
    private final Integer id;
    private final String type;

    public DataType(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
