package com.company.algorithmization;

import java.util.Arrays;

public class TwoDimensionalArrayTask4And5 {
    // можно добавить проверку на параметр, чтобы он был нечетным, там последней цифрой будет четное число N

    public static void main(String[] args) {

        int parametersOfMatrix = 6;
        int[][] squareMatrix = new int[parametersOfMatrix][parametersOfMatrix];

        // task four
//        showMatrix(fillOfMatrixVariantTaskFour(squareMatrix));

        // task five
        showMatrix(fillOfMatrixVariantTaskFive(squareMatrix));


    }

    public static void showMatrix(int[][] numbers) {

        for (int[] number : numbers) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(number[j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] fillOfMatrixVariantTaskFour(int[][] numbers) {

        System.out.println("The matrix from task four: ");

        for (int i = 0; i < numbers.length; i++) {
            int j = 0;// инициализировала здесь, чтобы был виден второму фор
            if (i % 2 == 0) {
                for (; j < numbers[i].length; j++) {
                    numbers[i][j] = j + 1;
                }
            } else {
                for (int h = numbers.length; h > 0; h--) {
                    numbers[i][j] = h;
                    j++;
                }
            }
        }
        return numbers;
    }

    public static int[][] fillOfMatrixVariantTaskFive(int[][] numbers) {

        System.out.println("The matrix from task five: ");

        int numberForFill = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-i; j++) {
                numbers[i][j] = numberForFill;
            }
            numberForFill++;
        }
        return numbers;
    }
}