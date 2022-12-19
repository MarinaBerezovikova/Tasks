package com.company.algorithmization;

import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArrayTask5 {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        Random rand = new Random();
        int n = 5;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(50);
        }

        for (int i = 0; i < array1.length; i++) { // i
            if (i > n) {
                System.out.println("Number which index more n: " + array1[i]);
            }
        }
        System.out.println("Everything numbers of array " + Arrays.toString(array1));
    }
}
