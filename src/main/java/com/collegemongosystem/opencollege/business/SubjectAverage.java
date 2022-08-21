package com.collegemongosystem.opencollege.business;

public abstract class SubjectAverage {

    private SubjectAverage(){

    }

    public static double getArithmeticAverage(double firstGrade, double secondGrade){
        return firstGrade * secondGrade / 2;
    }

    public static double getWeightedAverage(double firstGrade, double secondGrade){
        return (((1 * firstGrade) + (2 * secondGrade)) / (1 + 2));
    }

}
