package com.example.dataJpa.one.to.one.dto;

import org.springframework.stereotype.Component;

@Component
public class StudentDto {

    private int studentId;
    private String name;
    private LaptopDto laptopDto;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LaptopDto getLaptopDto() {
        return laptopDto;
    }

    public void setLaptopDto(LaptopDto laptopDto) {
        this.laptopDto = laptopDto;
    }
}
