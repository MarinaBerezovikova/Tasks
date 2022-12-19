package com.company.examples;

import java.util.ArrayList;
import java.util.Collections;

public class testCompare {

    // Class 1
// Main class
// ArrayListSorting
    
        // Main driver method
        public static void main(String args[]) {

            // Creating an empty ArrayList of Student type
            ArrayList<Student> arraylist
                    = new ArrayList<Student>();

            // Adding elements to above List
            arraylist.add(new Student(12, "Riya", 15));
            arraylist.add(new Student(14, "Mahima", 16));
            arraylist.add(new Student(13, "Shubhi", 15));

            // Sorting above list using sort() method
            // of Collections class
            Collections.sort(arraylist);

            // Iterating over list via for each loop and
            // printing all elements inside the List
            for (Student str : arraylist) {
                System.out.println(str);
            }
        }
    }

    // Class 2
// Implementing Comparable interface
    class Student implements Comparable<Student> {

        // Class data members
        private String studentName;
        private int rollno;
        private int studentAge;

        // Constructor of Student class
        public Student(int rollno, String studentname,
                       int studentAge) {

            // this keyword refers to current instance itself
            this.rollno = rollno;
            this.studentName = studentname;
            this.studentAge = studentAge;
        }
        
        // Getter and Setter methods
        public String getStudentname() { return studentName; }
        public void setStudentname(String studentname) {
            this.studentName = studentname;
        }

        public int getRollno() { return rollno; }
        public void setRollno(int rollno) {
            this.rollno = rollno;
        }

        public int getStudentAge() { return studentAge; }
        public void setStudentAge(int studentAge) {
            this.studentAge = studentAge;
        }


        // overriding the compareTo method of Comparable class
        @Override public int compareTo(Student compareStu) {
            int compareAge = compareStu.getStudentAge();

            //  For Ascending order
            return this.studentAge - compareAge;

            // For Descending order do like this
            // return compareage-this.studentage;
        }

        @Override public String toString() {
            return "[ rollno=" + rollno + ", name="
                    + studentName + ", age=" + studentAge + "]";
        }
    }