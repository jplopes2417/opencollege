package com.collegemongosystem.opencollege.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(value = "courses")
public class Course {

    @Id
    private String courseId;
    private String courseName;
    private List<Subject> subjects;

}
