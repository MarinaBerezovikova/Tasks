package com.company.algorithmization;

public class TwoDimensionalArrayTask2 {

    public static void main(String[] args) {

        int[][] members = new int[5][5];

        System.out.println("We have a square matrix: ");
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < members[i].length; j++) {
                members[i][j] = (int) (Math.random() * 10);
                System.out.print(members[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\nWe have output the numbers, that are located on diagonal: ");

        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < members.length; j++) {
                if (i == j) {
                    System.out.print(members[i][j] + "  ");
                }
            }
        }
    }
}