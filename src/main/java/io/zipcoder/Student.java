package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {


    private String firstName;
    private String lastName;
    private ArrayList<Double>examScores;


    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores= new ArrayList<>(Arrays.asList(examScores));


    }

    public void setFirstName(String firstName){
        this.firstName= firstName;
    }

    public String getFirstName(){

        return firstName;
    }

    public void setLastName(String lastName){

        this.lastName= lastName;
    }

    public String getLastName(){

        return lastName;
    }

    public Integer getNumberOfExamsTaken(){

        return examScores.size();
    }

    public String addExamScore(double examScore){

         examScores.add(examScore);

         return examScores.toString();
    }

    public void setExamScore(int examNumber, double newScore) {

        examScores.remove(examNumber-1);
        examScores.add(examNumber-1, newScore);

    }

    public Double getAverageExamScore(){

        Double sum= 0.0;
        for (int i=0; i < examScores.size(); i++){

            sum += examScores.get(i);

        }

        return sum/(examScores.size());
    }

    public String getExamScores(){

        return examScores.toString();

    }

    @Override
    public String toString(){

        String student = firstName + " " + lastName + "\n" + "Average Score: "
                + getAverageExamScore().intValue() + "\n" + getExamScores();


        return student;
    }
}
/**
 public void setMigrationMonth(String expected) {

 }

 public String getMigrationMonth() {

 return "August";
 }*/