package com.company.circles;

public class CircleTask3 {
    public static void main(String[] args) {

        double number = 0;
        double square = 0;
        double sum = 0;

        for (int turn = 0; turn <= 100; turn = turn + 1) {
            square = Math.pow(number, 2);
            sum = square + sum;

            number = number + 1;
        }
        System.out.println((int) sum);
    }
}

// Найти сумму квадратов первых ста чисел
// Math.pow (base,exponent)