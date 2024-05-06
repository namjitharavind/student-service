package com.rakbank.studentservice.data.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;


@Getter
@Setter
public class Student {

    @Schema(name = "id", description = "Student Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    private Long id;
    @NotNull
    @Size(max = 20)
    @Schema(name = "name", example = "Nathasha Namjith", description = "Student Name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    private String name;
    @NotNull
    @Schema(name = "grade", description = "Student Grade", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("grade")
    private String grade;
    @NotNull
    @Schema(name = "mobile", example = "+971 509834759", description = "Mobile Number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("mobile")
    private String mobile;
    @NotNull
    @Schema(name = "school", example = "Gems Legacy", description = "School Name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("school")
    private String school;
}
