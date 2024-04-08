package com.system.models;

public class EquipmentAttribute {
    private final int id;
    private final String name;
    private final boolean isEditable;
    private final int dataTypeId;

    public EquipmentAttribute(int id, String name, boolean isEditable, int dataTypeId) {
        this.id = id;
        this.name = name;
        this.isEditable = isEditable;
        this.dataTypeId = dataTypeId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isEditable() {
        return isEditable;
    }

    public int getDataTypeId() {
        return dataTypeId;
    }
}
