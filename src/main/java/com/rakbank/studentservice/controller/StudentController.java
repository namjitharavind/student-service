package com.rakbank.studentservice.controller;


import com.rakbank.studentservice.core.data.ErrorResponse;
import com.rakbank.studentservice.data.dto.Student;
import com.rakbank.studentservice.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/student")
@Tag(name = "Student")
public class StudentController {

    private final StudentService studentService;


    @Operation(
            description = "Create a Student",
            tags = {"Student"}
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
    }
    )
    @PostMapping(
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentService.create(student);
    }


    @Operation(
            operationId = "getStudents",
            description = "Get Student by Grade",
            tags = {"Student"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK"),
                    @ApiResponse(responseCode = "500", description = "Unexpected error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
                    })
            }
    )
    @GetMapping(path = "/grade/{grade}")
    public List<Student> getStudentsByGrade(@PathVariable String grade) {
        return studentService.findByGrade(grade);
    }

    @Operation(
            operationId = "getStudents",
            description = "Get Student by Id",
            tags = {"Student"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK"),
                    @ApiResponse(responseCode = "404", description = "Student not found", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
                    }),
                    @ApiResponse(responseCode = "500", description = "Unexpected error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
                    })
            }
    )
    @GetMapping(path = "/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.findById(id);
    }
}
