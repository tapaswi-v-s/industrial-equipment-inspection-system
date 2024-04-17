package com.system.models;

public class Inspection {
    private final Integer id;
    private final String inspectiondate;
    private final String remark;
    private final Integer plantid;
    private final Integer inspectorid;
    private final Integer evaluatorid;

    public Inspection(Integer id, String inspectiondate, String remark, Integer plantid, Integer inspectorid, Integer evaluatorid) {
        this.id = id;
        this.inspectiondate = inspectiondate;
        this.remark = remark;
        this.plantid = plantid;
        this.inspectorid = inspectorid;
        this.evaluatorid = evaluatorid;
    }

    public Integer getId(){
        return id;
    }

    public String getInspectionDate(){
        return inspectiondate;
    }
    
    public String getRemark(){
        return remark;
    }
    
    public Integer getPlantId(){
        return plantid;
    }
    
    public Integer getInspectorId(){
        return inspectorid;
    }
    
    public Integer getEvaluatorId(){
        return evaluatorid;
    }

}
