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
@Document(value = "subjects")
public class Subject {

    @Id
    private String subjectId;
    private String subjectName;
    private List<Student> students;
    private Evaluation subjectEvaluation;

}
