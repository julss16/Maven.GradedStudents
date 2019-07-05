package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void getFirstName() {
        String firstName= "Amos";
        String lastName= "Johnson";
        Double[] examScores= {87.0, 100.0, 95.0};

        Student student= new Student(firstName, lastName, examScores);

        String expected= "Amos";
        String actual= student.getFirstName();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void getLastName() {
        String firstName= "Juls";
        String lastName= "Brown";
        Double[] examScores= {99.0, 75.0, 90.0};

        Student student= new Student(firstName, lastName, examScores);

        String expected= "Brown";
        String actual= student.getLastName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberOfExamsTaken() {
        String firstName= "Johnson";
        String lastName= "Michaels";
        Double[] examScores= {98.0, 40.0, 65.0};

        Student student= new Student(firstName, lastName, examScores);

        Integer expected= 3;
        Integer actual= student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addExamScore() {
        String firstName= "Ugo";
        String lastName= "Boss";
        Double[] examScores= {57.0, 99.0, 72.0};
        ArrayList<Double> examScores1= new ArrayList<>(Arrays.asList(examScores));
        Double examScore= 44.0;

        Student student= new Student(firstName, lastName, examScores);
        //When
        student.addExamScore(examScore);



        String expected= "[57.0, 99.0, 72.0, 44.0]";
        String actual= student.getExamScores();

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void getAverageExamScore() {
        String firstName= "Ajulu";
        String lastName= "Adigwe";
        Double[] examScores= {30.0, 100.0};
        Student student= new Student(firstName, lastName, examScores);

        //When
        Double expected= 65.0;
        Double actual= student.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScores() {
        String firstName= "Favour";
        String lastName= "Williams";
        Double[] examScores= {97.0, 50.0, 85.0};

        Student student= new Student(firstName, lastName, examScores);

        String expected= "[97.0, 50.0, 85.0]";
        String actual= student.getExamScores();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        String firstName= "Ajulu";
        String lastName= "Adigwe";
        Double[] examScores= {30.0, 100.0};
        Student student= new Student(firstName, lastName, examScores);

        String expected= "Ajulu Adigwe\n" + "Average Score: 65\n" +
                "[30.0, 100.0]";
        String actual= student.toString();

        Assert.assertEquals(expected, actual);
    }
}