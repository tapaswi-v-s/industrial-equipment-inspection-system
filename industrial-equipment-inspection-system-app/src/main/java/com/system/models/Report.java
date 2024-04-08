package com.system.models;

public class Report {

    private final Integer id;
    private final String reportNumber;
    private final String reportDocUrl;

    public Report(Integer id, String reportNumber, String reportDocUrl) {
        this.id = id;
        this.reportNumber = reportNumber;
        this.reportDocUrl = reportDocUrl;
    }

    public Integer getId(){
        return id;
    }

    public String getReportNumber(){
        return reportNumber;
    }

    public String getReportDocUrl(){
        return reportDocUrl;
    }
}
