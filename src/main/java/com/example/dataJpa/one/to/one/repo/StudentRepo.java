package com.example.dataJpa.one.to.one.repo;

import com.example.dataJpa.one.to.one.dto.JoinRequest;
import com.example.dataJpa.one.to.one.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

    @Query("SELECT new com.example.dataJpa.one.to.one.dto.JoinRequest(s.name, l.modelNumber) FROM Student s JOIN s.laptop l")
    List<JoinRequest> getJoinInformation();

    /*@Query("SELECT new com.example.dataJpa.one.to.one.dto.JoinRequest(s.name, l.modelNumber) FROM Student s JOIN laptop l")
    List<JoinRequest> getJoinInformation();*/

    @Modifying
    @Transactional
    @Query("update Student s set s.name=?1 where studentId=?2")
    int updateStudent(String name,int studentId);

}
