package com.example.dataJpa.one.to.one.controller;

import com.example.dataJpa.one.to.one.dto.LaptopDto;
import com.example.dataJpa.one.to.one.dto.LaptopJoin;
import com.example.dataJpa.one.to.one.entity.Laptop;
import com.example.dataJpa.one.to.one.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laptops")
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping
    public Laptop saveLaptop(@RequestBody Laptop laptop) {
        return laptopService.saveLaptop(laptop);
    }

    @GetMapping("/s_name")
    public List<LaptopJoin> getStudentNameByS(){
        return laptopService.getStudentNameByS();
    }


}
