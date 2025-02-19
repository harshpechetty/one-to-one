package com.example.dataJpa.one.to.one.dto;

public class JoinRequest {
    private String name;
    private String modelNumber;

    public JoinRequest(String name, String modelNumber) {
        this.name = name;
        this.modelNumber = modelNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
}
