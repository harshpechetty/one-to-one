package com.example.dataJpa.one.to.one.repo;

import com.example.dataJpa.one.to.one.dto.LaptopJoin;
import com.example.dataJpa.one.to.one.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
   @Query("SELECT new com.example.dataJpa.one.to.one.dto.LaptopJoin(s.name,l.brand) FROM Student s JOIN laptop l where s.name like 'S%'")
   List<LaptopJoin> getJoinInformation();
}
