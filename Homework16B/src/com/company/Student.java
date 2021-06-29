package com.company;

public class Student {

    private String birthday;
    private String surname;
    private String name;
    private char gender;
    private int age;

    public Student() {

    }

    public Student(String birthday, String surname, String name, char gender, int age) {
        this.birthday = birthday;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String info = "Student name is - " + name + " | " + "Student surname is - " + surname + " | " +
                "Student birthday is - " + birthday + " | " + "Student age is - " + age + " | "
                + "Student gender is - " + gender;
        return info;
    }
}
