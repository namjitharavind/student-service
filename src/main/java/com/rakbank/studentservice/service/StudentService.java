package com.rakbank.studentservice.service;


import com.rakbank.studentservice.data.dto.Student;

import java.util.List;


public interface StudentService {

    Student create(Student student);

    List<Student> findByGrade(String grade);

    Student findById(Long id);
}
