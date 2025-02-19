package com.example.dataJpa.one.to.one.service;

import com.example.dataJpa.one.to.one.dto.JoinRequest;
import com.example.dataJpa.one.to.one.dto.LaptopDto;
import com.example.dataJpa.one.to.one.dto.StudentDto;
import com.example.dataJpa.one.to.one.entity.Laptop;
import com.example.dataJpa.one.to.one.entity.Student;
import com.example.dataJpa.one.to.one.repo.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;



    public Student save(Student student){
        return studentRepo.save(student);
    }
    public List<JoinRequest> getResult(){
        return studentRepo.getJoinInformation();
    }


    public boolean updateStudentName(String name, int studentId) {
        int rowsUpdated = studentRepo.updateStudent(name, studentId);
        return rowsUpdated > 0;
    }

    /*public Student createStudent(StudentDto studentDto) {
        // Create a new student
        Student student = new Student();
        student.setStudentId(studentDto.getStudentId());
        student.setName(studentDto.getName());

        // If a laptop is provided in the DTO, create the laptop and associate it
        if (studentDto.getLaptopDto() != null) {
            LaptopDto laptopDto = studentDto.getLaptopDto();
            Laptop laptop = laptopService.createLaptop(laptopDto);
            student.setLaptop(laptop);
        }

        return studentRepo.save(student);
    }  */
}

