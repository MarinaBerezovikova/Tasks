package com.company.algorithmization;

import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArrayTask3 {

//    public static int randomNumber (int number) {
//
//        Random random = new Random();
//        number = random.nextInt(200);
//        return number;                  // почему обязательно надо возвращать? потому что нет void в начале класса?
//    }

    public static void main(String[] args) {

        int valuePositive = 0;
        int valueNegative = 0;
        int valueZero = 0;
        Random random = new Random();
        int[] beautifulFifty = new int[50];

        for (int i = 0; i < beautifulFifty.length; i++) {
            beautifulFifty[i] = random.nextInt(201) - 100; // числа от -100 до 100
        }

        for (int j : beautifulFifty) {

            if (j > 0)
                valuePositive++;
            else if (j < 0) // если убрать условие это, то  нули будут учитываться в негатив, что неправильно
                valueNegative++;
            else valueZero++;
        }
        System.out.println(Arrays.toString(beautifulFifty));
        System.out.println("Sum of positive numbers = " + valuePositive);
        System.out.println("Sum of negative numbers = " +valueNegative);
        System.out.println("Sum of zeros = " +valueZero);

    }
}
