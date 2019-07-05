package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getStudents() {


    }

    @Test
    public void getAverageExamScore() {
    }

    @Test
    public void addStudent() {
        int maxNumberOfStudents= 1;
        Classroom classroom= new Classroom(maxNumberOfStudents);
        String firstName = "David";
        String lastName = "Jacobs";
        Double[] examScores = {50.0, 100.0, 80.0};
        Student student = new Student(firstName, lastName, examScores);

        Student[] preEnrollment= classroom.getStudents();
        classroom.addStudent(student);
        Student[] enrolled= classroom.getStudents();

        Assert.assertEquals(2, enrolled.length);


    }

    @Test
    public void removeStudent() {
        Classroom classroom= new Classroom(7);
        String firstName = "Alex";
        String lastName = "Jacobs";
        Double[] examScores = {70.0, 100.0, 30.0};
        Student student = new Student(firstName, lastName, examScores);

        Student[] list= classroom.getStudents();
        classroom.addStudent(student);
        classroom.removeStudent(student.getFirstName(), student.getLastName());
        Student[] newList= classroom.getStudents();

        Assert.assertEquals(7, newList.length);

    }

    @Test
    public void getStudentByScore() {
    }

    @Test
    public void getGradeBook() {
    }
}
