package com.system.models;

import java.util.Date;

public class Inspection {
    private final Integer id;
    private String inspection_date;
    private String remark;
    private Integer plant_Id;
    private Integer inspector_id;
    private Integer evaluator_id;
    private String evaluator_remark;

    
       public Inspection(Integer id,String inspection_date,String remark,Integer plant_Id,
               Integer inspector_id,Integer evaluator_id,String evaluator_remark) {
        this.id = id;
        this.inspection_date= inspection_date;
        this.remark= remark;
        this.plant_Id= plant_Id;
        this.inspector_id= inspector_id;
        this.evaluator_id= evaluator_id;
        this.evaluator_remark=evaluator_remark;
    }
       
        public Inspection(Integer id) {
        this.id = id;
        
    }
    
    public String getInspection_date() {
        return inspection_date;
    }

    public void setInspection_date(String inspection_date) {
        this.inspection_date = inspection_date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPlant_Id() {
        return plant_Id;
    }

    public void setPlant_Id(Integer plant_Id) {
        this.plant_Id = plant_Id;
    }

    public Integer getInspector_id() {
        return inspector_id;
    }

    public void setInspector_id(Integer inspector_id) {
        this.inspector_id = inspector_id;
    }

    public Integer getEvaluator_id() {
        return evaluator_id;
    }

    public void setEvaluator_id(Integer evaluator_id) {
        this.evaluator_id = evaluator_id;
    }

    public String getEvaluator_remark() {
        return evaluator_remark;
    }

    public void setEvaluator_remark(String evaluator_remark) {
        this.evaluator_remark = evaluator_remark;
    }


    public Integer getId(){
        return id;
    }

   

}
