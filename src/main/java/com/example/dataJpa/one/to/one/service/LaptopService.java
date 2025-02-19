package com.example.dataJpa.one.to.one.service;

import com.example.dataJpa.one.to.one.dto.LaptopDto;
import com.example.dataJpa.one.to.one.dto.LaptopJoin;
import com.example.dataJpa.one.to.one.entity.Laptop;
import com.example.dataJpa.one.to.one.entity.Student;
import com.example.dataJpa.one.to.one.repo.LaptopRepo;
import com.example.dataJpa.one.to.one.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepo laptopRepo;

    public Laptop saveLaptop(Laptop laptop){
      return laptopRepo.save(laptop);
    }
    public List<LaptopJoin> getStudentNameByS(){
        return laptopRepo.getJoinInformation();
    }

}

