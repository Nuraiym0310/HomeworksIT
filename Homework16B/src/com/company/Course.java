package com.company;


public class Course {
    private String nameOfCourse;
    private String dayOfCreation;
    private int id;
    private String nameOfTeacher;


    public Course() {

    }

    public Course(String nameOfCourse, String dayOfCreation, int id, String nameOfTeacher) {

    }

    public Course(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;

    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getDayOfCreation() {
        return dayOfCreation;
    }

    public void setDayOfCreation(String dayOfCreation) {
        this.dayOfCreation = dayOfCreation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }
}
