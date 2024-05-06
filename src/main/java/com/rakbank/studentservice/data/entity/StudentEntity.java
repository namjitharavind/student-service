package com.rakbank.studentservice.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "grade", nullable = false)
    private String grade;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "school", nullable = false)
    private String school;

}
