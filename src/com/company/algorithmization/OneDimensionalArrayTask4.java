package com.company.algorithmization;

import java.util.Arrays;

public class OneDimensionalArrayTask4 {

    public static void main(String[] args) {

        double[] twenty = new double[20];

        for (int i = 0; i < twenty.length; i++) {
            twenty[i] = Math.random() * 40 - 20; // заполняет массив double значениями от -20 до 20 (20 исключительно)
        }
        // checking
//        double[] twenty = {-1.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
//        double[] twenty = {-1.0, -2.0, -3.0, -4.0, -8.0, -6.0, -9.0};
//        double[] twenty = {-13.4, -15.5, 0.0, 0.0, 0.0, 0.0, 0.0};
//        double[] twenty = {2.0, 2.0, 2.0, 2.0, 2.0, 2.0, 2.0};

        double min = twenty[0]; // переменные, которые хранят минимальное и максимальное значение массива
        double max = twenty[0];
        int indexMin = 0; // переменные, которые хранят индексы мин и макс значений
        int indexMax = 0;

        for (int i = 1; i < twenty.length; i++) { // int i = 1 потому что 0левой мы уже присвоили мин и макс

            if (twenty[i] < min) {
                min = twenty[i];
                indexMin = i;
            } else if (twenty[i] > max) {
                max = twenty[i];
                indexMax = i;
            }
        }

        System.out.println("All items of array: " + Arrays.toString(twenty));

        double c;
        c = twenty[indexMin];
        twenty[indexMin] = twenty[indexMax];
        twenty[indexMax] = c;

        System.out.println("Minimum item of the array: " + min);
        System.out.println("Maximum item of the array: " + max);
        System.out.println("The index of the minimum item: " + indexMin);
        System.out.println("The index of the maximum item: " + indexMax);
        System.out.println("All items of array after changes: " + Arrays.toString(twenty));
    }
}