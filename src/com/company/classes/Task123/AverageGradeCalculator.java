package com.company.classes.Task123;

import java.util.List;

class AverageGradeCalculator {

    public void calculateGPA(Student student) { // GPA grade point average

        int sumOfGrades = 0;
        List<Integer> grades = student.getGrades();

        for (Integer grade : grades) {
            sumOfGrades = sumOfGrades + grade;
        }
        student.setAverageGrade((double) sumOfGrades / grades.size());
    }
}
