package com.collegemongosystem.opencollege.business;

public enum SubjectStatus {

    APPROVED,
    DISAPPROVED;

    private String status;

    SubjectStatus getStatus(double arithmeticAverage, double weightedAverage){
        return arithmeticAverage > 7 || weightedAverage > 7  ? APPROVED : DISAPPROVED;
    }


}
