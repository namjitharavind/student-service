package com.rakbank.studentservice.data.mapper;

import com.rakbank.studentservice.data.dto.Student;
import com.rakbank.studentservice.data.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(config = CommonMapperConfig.class, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface StudentMapper {
    StudentMapper MAPPER = Mappers.getMapper(StudentMapper.class);

    Student mapToStudent(StudentEntity studentEntity);

    List<Student> mapToStudentList(List<StudentEntity> studentEntities);

    StudentEntity mapToStudentEntity(Student student);
}
