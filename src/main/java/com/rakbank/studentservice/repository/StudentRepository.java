package com.rakbank.studentservice.repository;


import com.rakbank.studentservice.data.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

     List<StudentEntity> findByGrade(String grade);

}