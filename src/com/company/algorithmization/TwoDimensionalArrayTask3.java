package com.company.algorithmization;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArrayTask3 {

    public static void fillTheArrayOfNumbersFromZeroUntilTen(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int scanAndCheckNumberForString(int arrayStringLength, Scanner input) {

        System.out.println("Input a number for output a string: ");

        int number = 0;
        boolean bool = true;

        while (bool) {
            number = input.nextInt();
            if (number >= 0 & number <= arrayStringLength - 1) {
                bool = false;
            } else {
                System.out.println("Input an another number: ");
            }
        }
        return number;
    }

    public static int scanAndCheckNumberForColumn(int arrayColumnLength, Scanner input) {

        System.out.println("Input a number for output a column: ");

        int number = 0;
        boolean bool = true;

        while (bool) {
            number = input.nextInt();
            if (number >= 0 & number <= arrayColumnLength - 1) { //проверка не учитывает вариант зубчатого массива
                bool = false;
            } else {
                System.out.println("Input an another number: ");
            }
        }

        return number;
    }

    public static int[] getString(int[][] matrix, int num) {
        return matrix[num];
    }

    public static int[] getColumn(int[][] matrix, int num) {

        int[] columnArray = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            columnArray[i] = matrix[i][num];
        }
        return columnArray;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] dimensionalArray = new int[7][7];

        int numberStringOfArrayForOutput = scanAndCheckNumberForString(dimensionalArray.length, input);
        int numberOfColumnOfArrayForOutput = scanAndCheckNumberForColumn(dimensionalArray[0].length, input);

        System.out.println("We have a matrix: ");
        fillTheArrayOfNumbersFromZeroUntilTen(dimensionalArray);

        System.out.println("The string number " + numberStringOfArrayForOutput + " consist these numbers: \n"
                + Arrays.toString(getString(dimensionalArray, numberStringOfArrayForOutput)));
        System.out.println("The column number " + numberOfColumnOfArrayForOutput + " consist these numbers: \n"
                + Arrays.toString(getColumn(dimensionalArray, numberOfColumnOfArrayForOutput)));
    }
}

// в методы передаю только длины, так как только ими и пользуюсь, а не всеми массивами
// когда объявлена в классе - видна всем методам и не надо передавать ее в них?

// Можно дописать принт в методах и тогда они будут show. Или же методы все же getColumn

//можно ли написать эти методы как void?
//Здесь нужно возвращать значения(результат нужно показать), поэтому воид не получится.
// В методе showColumn можно обозвать переменную не array a columnArray или просто column, но это мелочь.

// Методы можно сделать приватными, т к они только для этого класса.
// Наверное можно добавить проверку есть ли в матрице строка n и столбец m.

//Если класс создан только ради работы с массивом, то хорошо чтобы о нём знал не только метод мейн
//А если это просто переменная нужная для расчёта чего-то,
// то её можно в методе count создать и больше никому о ней знать не нужно
//Можно объявить массив как переменную класса и она будет видна всем методам класса, тогда его можно не передавать в метод и сразу работать с ним.
//        Тогда можно ничего не возвращать

//результат метода принимает другой метод, верно