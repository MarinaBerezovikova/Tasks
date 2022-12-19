package com.company.algorithmization;

import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArrayTask6 {
    public static void main(String[] args) {

        int lenghtArrays = 25;
        double[] array2 = new double[lenghtArrays];
        boolean[] isPrime = new boolean[lenghtArrays];

        for (int i = 0; i < lenghtArrays; i++) {
            array2[i] = Math.random() * 11 - 5.5; // -5.5(a) until 5.5 (b) // (b-a) + a //(5.5 - ( - 5.5)) + 5.5;
        }
        Random random = new Random();
        for (int i = 0; i < lenghtArrays; i++) {
            array2 [i] = random.nextDouble()* 20.0 - 10.0;
        }

//        Arrays.fill(array2, 1.0);
        Arrays.fill(isPrime, true);
        System.out.println(Arrays.toString(array2));

        for (int i = 2; i * i < lenghtArrays; i++) { // решето эратосфена
            if (isPrime[i]) {
                for (int j = 2 * i; j < lenghtArrays; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        double sum = 0.0;

        for (int i = 2; i < lenghtArrays; i++) {
            if (isPrime[i]) {
                sum = sum + array2[i];

            }
        }
        System.out.println("Sum of value numbers, where that an index is a prime number: " + sum);
    }
}


