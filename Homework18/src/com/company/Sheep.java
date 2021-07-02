package com.company;

public class Sheep {
    private String weight;
    private int age;
    private String gender;
    private String name;

    public Sheep() {
    }

    public Sheep(String weight, int age, String gender, String name) {
        this.weight = weight;
        if (age < 0){
            System.out.println(age + " Wrong data!");
        }
        else{
            this.age = age;
        }
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight='" + weight + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

