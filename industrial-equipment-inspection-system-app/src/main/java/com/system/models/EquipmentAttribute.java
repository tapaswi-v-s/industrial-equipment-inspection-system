package com.system.models;

public class EquipmentAttribute {
    private final Integer id;
    private final String name;
    private final boolean isEditable;
    private final DataType dataType;
    private final Object value;

    public EquipmentAttribute(Integer id, String name, boolean isEditable, 
            DataType dataType, Object value) {
        this.id = id;
        this.name = name;
        this.isEditable = isEditable;
        this.dataType = dataType;
        this.value = value;
    }

    public EquipmentAttribute(String name, boolean isEditable, DataType dataType, Object value) {
        id = null;
        this.name = name;
        this.isEditable = isEditable;
        this.dataType = dataType;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isEditable() {
        return isEditable;
    }

    public DataType getDataType() {
        return dataType;
    }

    public Object getValue() {
        return value;
    }
    
}
