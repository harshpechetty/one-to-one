package com.example.dataJpa.one.to.one.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "jpa_student")
public class Student {
    @Id
   private int studentId;
   private String name;
    //@JsonManagedReference

   @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
   @JsonManagedReference
   private Laptop laptop;

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

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
