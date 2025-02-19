package com.example.dataJpa.one.to.one.dto;

public class LaptopJoin {
    private String name;
    private String brand;

    public LaptopJoin(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
