package com.system.models;

public class Inspection {
    private final Integer id;
    private final String date;
    private final String remark;
    private final int plantID;
    private final int inspectorID;
    private int evaluatorID;
    private String evaluatorRemark;

    public Inspection(Integer id, String date, String remark, int plantID, int inspectorID, int evaluatorID, String evaluatorRemark) {
        this.id = id;
        this.date = date;
        this.remark = remark;
        this.plantID = plantID;
        this.inspectorID = inspectorID;
        this.evaluatorID = evaluatorID;
        this.evaluatorRemark = evaluatorRemark;
    }

    public Inspection(Integer id, String date, String remark, int plantID, int inspectorID) {
        this.id = id;
        this.date = date;
        this.remark = remark;
        this.plantID = plantID;
        this.inspectorID = inspectorID;
        this.evaluatorID = -1;
        this.evaluatorRemark = null;
    }

    public Inspection(String date, int plantID) {
        this.date = date;
        this.plantID = plantID;
        this.id = null;
        this.remark = null;
        this.inspectorID = -1;
        
    }
    
    

    public void setEvaluatorID(int evaluatorID) {
        this.evaluatorID = evaluatorID;
    }

    public void setEvaluatorRemark(String evaluatorRemark) {
        this.evaluatorRemark = evaluatorRemark;
    }

    public Integer getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getRemark() {
        return remark;
    }

    public int getPlantID() {
        return plantID;
    }

    public int getInspectorID() {
        return inspectorID;
    }

    public int getEvaluatorID() {
        return evaluatorID;
    }

    public String getEvaluatorRemark() {
        return evaluatorRemark;
    }

}
