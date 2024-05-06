package com.rakbank.studentservice.service.impl;

import com.rakbank.studentservice.core.exception.BusinessException;
import com.rakbank.studentservice.data.dto.Student;
import com.rakbank.studentservice.data.mapper.StudentMapper;
import com.rakbank.studentservice.repository.StudentRepository;
import com.rakbank.studentservice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.rakbank.studentservice.core.constants.Errors.STUDENT_NOT_FOUND;


@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private  final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    @Override
    public Student create(Student student) {
        return studentMapper.mapToStudent(studentRepository.save(studentMapper.mapToStudentEntity(student)));
    }

    @Override
    public List<Student> findByGrade(String grade) {
        return studentMapper.mapToStudentList(studentRepository.findByGrade(grade));
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).map(studentMapper::mapToStudent).orElseThrow(()-> new BusinessException(STUDENT_NOT_FOUND));
    }
}
