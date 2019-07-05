package io.zipcoder;

import org.junit.ClassRule;

import java.util.*;

public class Classroom {

    private Student[] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents){
      this.students= new Student[maxNumberOfStudents];
    }

    public Classroom(){
        this(30);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {

        Double sum= 0.0;
        for( Student student: students){

           sum +=student.getAverageExamScore();

        }
        return sum/(students.length);
    }

    public Student[] addStudent(Student student){

            ArrayList<Student > enrollment= new ArrayList<>();
            enrollment.addAll(Arrays.asList(students));

            for ( int i=0; i < students.length; i++){
                if (students[i] != student){
                    enrollment.add(student);
                }
            }
            Student[] postEnrollment= new Student[enrollment.size()];
            return this.students= enrollment.toArray(postEnrollment);
    }

    public Student[] removeStudent(String firstName, String lastName) {

        ArrayList<Student> newStudents = new ArrayList<>();
        newStudents.addAll(Arrays.asList(students));

        for (Student student : students) {

            if (student.getFirstName() == firstName && student.getLastName() == lastName) {
                newStudents.remove(student);
            }
        }
            Student[] newStudents2 = new Student[newStudents.size()];
            return this.students = newStudents.toArray(newStudents2);

    }

    public Student[] getStudentByScore (){

        ArrayList<Student> studentsWithScores= new ArrayList<>(Arrays.asList(students));
        StudentComparator studentComparator= new StudentComparator();

        studentsWithScores.sort(studentComparator);
        Student[] stud= new Student[studentsWithScores.size()];


        return studentsWithScores.toArray(stud);
    }

    public Map<Student, String> getGradeBook(){

        Map<Student, String> gradeBook= new HashMap<>();
        Student[] studentsOrdered= getStudentByScore();

        for(int i=0; i < studentsOrdered.length; i++){
            String grade= "";
            Double percentile= (double)(i+1)/studentsOrdered.length;

            if(percentile > 0.9 ){
                grade= "A";
            }else if( percentile > 0.7){
                grade= "B";
            }else if (percentile > 0.5){
                grade= "C";
            }else if( percentile > 0.1){
                grade= "D";
            }else if( percentile < 0.1){
                grade= "F";
            }
            gradeBook.put(studentsOrdered[i], grade);
        }

        return gradeBook;
    }
}
