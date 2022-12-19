package com.company.algorithmization;

import java.util.Arrays;

public class OneDimensionalArrayTask2 {
    public static void main(String[] args) {

        int[] oneHundred = new int[100];

        for (int i = 0; i < oneHundred.length; i++) {//заполнение массива
            oneHundred[i] = i + 1;
        }

        int sumOfChanges = 0;
        int numberOfSpecifier = 50;

        for (int i = 0; i < oneHundred.length; i++) {

            if (oneHundred[i] > numberOfSpecifier) { // i = это индекс, one...[i] = это как ссылка к значению ячейки
                oneHundred[i] = 50;
                sumOfChanges++;
            }
        }
        System.out.println("Length of array = " + oneHundred.length);
        System.out.println("Sum of exchange = " + sumOfChanges);
        System.out.println(Arrays.toString(oneHundred));
    }
}