package com.company.algorithmization;

public class DecompositionTask7 {
    // Написать метод(методы) для вычисления суммы факториалов вех нечетных чисел от 1 до 9.

    // можно ли функцию с факториалом сделать воид и ли рекурсией?

    public static int calculateFactorialOfNumber(int a) {

        int n = a - 1, result = 0;

        while (n > 0) {
            if (n == a - 1) result = a * n;
            else result = result * n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {

        int number = 9;
        int finalResult = 0;
        int midRes;

        for (int i = number; i > 0; i--) {
            if (i % 2 == 0) {
                midRes = calculateFactorialOfNumber(i);
                finalResult = finalResult + midRes;
            }
        }
        System.out.println(finalResult);
    }
}
