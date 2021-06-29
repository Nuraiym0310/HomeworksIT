package com.company;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[5];
        students[0] = new Student("03.02.1995","Test","Test",'M',25);
        students[1] = new Student("01.01.1996","Kim","Partick",'M',20);
        Course course = new Course("Math","01.09.2021",1,"Lee");
        Groups groups = new Groups();
        groups.setStudents(students);
        groups.setCourse(course);
        groups.setDateOfTheBeginning("01/09/2021");
        groups.setDurationInMonth("3 month");

        System.out.println(groups.getStudents()[0]);
        System.out.println(groups.getStudents()[1]);



    }
}
