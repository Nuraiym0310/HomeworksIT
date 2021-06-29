package com.company;

public class Groups {
    private Student[] students;
    private Course course;
    private String dateOfTheBeginning;
    private String durationInMonth;


    public Groups() {

    }

    public Groups(Student[] students, Course course, String dateOfTheBeginning, String durationInMonth) {
        this.students = students;
        this.course = course;
        this.dateOfTheBeginning = dateOfTheBeginning;
        this.durationInMonth = durationInMonth;

    }


    public Student[] getStudents() {
        return students;
    }



    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDateOfTheBeginning() {
        return dateOfTheBeginning;
    }

    public void setDateOfTheBeginning(String dateOfTheBeginning) {
        this.dateOfTheBeginning = dateOfTheBeginning;
    }

    public String getDurationInMonth() {
        return durationInMonth;
    }

    public void setDurationInMonth(String durationInMonth) {
        this.durationInMonth = durationInMonth;
    }
}
