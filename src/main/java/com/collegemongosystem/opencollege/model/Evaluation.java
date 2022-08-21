package com.collegemongosystem.opencollege.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(value = "evaluations")
public class Evaluation {

    @Id
    private String evaluationId;
    private Student student;
    private double firstGrade;
    private double secondGrade;
    private double arithmeticAverage;
    private double weightedAverage;

}
