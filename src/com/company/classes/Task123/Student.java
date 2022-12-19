package com.company.classes.Task123;

import java.util.ArrayList;

class Student {

    private String name;
    private String surname;
    private int groupNumber;
    private final ArrayList<Integer> grades;
    private double averageGrade;


    // constructors

    public Student() {
        this.name = "Student Name";
        this.surname = "Student Surname";
        this.groupNumber = 0;
        this.grades = new ArrayList<Integer>(5);
        this.averageGrade = 0.0;
    }

    public Student( final String name, final String surname, int groupNumber) {
        this();
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
    }


    // getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void addGrade(int grade) { //setter for list
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}