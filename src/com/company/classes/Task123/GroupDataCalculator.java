package com.company.classes.Task123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.disjoint;

public class GroupDataCalculator {

    private static final Integer[] NON_BEST_STUDENTS_GRADES = {1, 2, 3, 4, 5, 6, 7, 8, 0};
    private static final int BORDER_OF_NORMAL_ACADEMIC_PERFORMANCE = 6;

    public String worstStudentsByPerformance(List<Student> studentsGroup) { //by average grade

        List<String> worstStudents = new ArrayList<>();

        for (Student student : studentsGroup) {
            if (student.getAverageGrade() < BORDER_OF_NORMAL_ACADEMIC_PERFORMANCE) {
                worstStudents.add(student.getName() +" "+ student.getSurname());
            }
        }

        if (worstStudents.size() != 0) {
            return "The worst students of group are " + worstStudents;
        } else {
            return "Worst students not found. Probably everyone in this group work hard.";
        }
    }

    public void showBestsStudents(List<Student> studentsGroup) {

        List<Integer> worseGrades = new ArrayList<>(Arrays.asList(NON_BEST_STUDENTS_GRADES));
        List<String> bestStudents = new ArrayList<>();

        for (Student student : studentsGroup) {
            List<Integer> checkArray = student.getGrades();
            if (disjoint(checkArray, worseGrades)) {
                // Returns true if the two specified collections have no elements in common
                bestStudents.add(student.getName() + " " + student.getSurname());
            }
        }
        System.out.println("The best students are: \n" + bestStudents);
    }
}