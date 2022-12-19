package com.company.classes.Task123;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        AverageGradeCalculator averageGradeCalculator = new AverageGradeCalculator();
        GroupDataCalculator groupDatacalculator = new GroupDataCalculator();

        Student student1 = new Student("Дилон", "Маск", 100);
        student1.addGrade(10);student1.addGrade(9);student1.addGrade(9);student1.addGrade(9);student1.addGrade(9);
        averageGradeCalculator.calculateGPA(student1);

        Student student2 = new Student("Стив", "Джобс", 100);
        student2.addGrade(4);student2.addGrade(7);student2.addGrade(5);student2.addGrade(4);student2.addGrade(5);
        averageGradeCalculator.calculateGPA(student2);

        Student student3 = new Student("Билл", "Гейтс", 100);
        student3.addGrade(10);student3.addGrade(9);student3.addGrade(9);student3.addGrade(10);student3.addGrade(10);
        averageGradeCalculator.calculateGPA(student3);

        Student student4 = new Student("Джефф", "Безос", 100);
        student4.addGrade(5);student4.addGrade(3);student4.addGrade(2);student4.addGrade(10);student4.addGrade(10);
        averageGradeCalculator.calculateGPA(student4);

        Student student5 = new Student("Уоррен", "Баффет", 100);
        student5.addGrade(8);student5.addGrade(9);student5.addGrade(9);student5.addGrade(8);student5.addGrade(8);
        averageGradeCalculator.calculateGPA(student4);

        student1.setName("Илон");

        List<Student> studentsGroup = new ArrayList<>(); // собрать всех студентов в группу
        studentsGroup.add(student1);
        studentsGroup.add(student2);
        studentsGroup.add(student3);
        studentsGroup.add(student4);
        studentsGroup.add(student5);

        System.out.println(groupDatacalculator.worstStudentsByPerformance(studentsGroup));
        groupDatacalculator.showBestsStudents(studentsGroup);
    }
}