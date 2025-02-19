package com.example.dataJpa.one.to.one.controller;

import com.example.dataJpa.one.to.one.dto.JoinRequest;
import com.example.dataJpa.one.to.one.dto.StudentDto;
import com.example.dataJpa.one.to.one.entity.Student;
import com.example.dataJpa.one.to.one.service.StudentService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping("/laptop")
    public List<JoinRequest> getStudentLaptop() {
        return studentService.getResult();
    }

    @PutMapping("/update/{studentId}")
    public ResponseEntity<String> update(@RequestBody String name, @PathVariable int studentId) {
        boolean updated = studentService.updateStudentName(name, studentId);
        if (updated) {
            return ResponseEntity.ok("Student name updated successfully");
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}




