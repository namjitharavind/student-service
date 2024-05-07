package com.rakbank.studentservice.data.mapper;

import com.rakbank.studentservice.data.dto.Student;
import com.rakbank.studentservice.data.entity.StudentEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-07T14:50:17+0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student mapToStudent(StudentEntity studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentEntity.getId() );
        student.setName( studentEntity.getName() );
        student.setGrade( studentEntity.getGrade() );
        student.setMobile( studentEntity.getMobile() );
        student.setSchool( studentEntity.getSchool() );

        return student;
    }

    @Override
    public List<Student> mapToStudentList(List<StudentEntity> studentEntities) {
        if ( studentEntities == null ) {
            return null;
        }

        List<Student> list = new ArrayList<Student>( studentEntities.size() );
        for ( StudentEntity studentEntity : studentEntities ) {
            list.add( mapToStudent( studentEntity ) );
        }

        return list;
    }

    @Override
    public StudentEntity mapToStudentEntity(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setId( student.getId() );
        studentEntity.setName( student.getName() );
        studentEntity.setGrade( student.getGrade() );
        studentEntity.setMobile( student.getMobile() );
        studentEntity.setSchool( student.getSchool() );

        return studentEntity;
    }
}
