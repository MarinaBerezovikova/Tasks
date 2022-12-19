package com.company.circles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleTask1 {

    public static void main(String[] args) {

        System.out.println("Введите целое положительное число: ");

        Scanner scr = new Scanner(System.in);

        long sum = 0;

        try {
        } catch (InputMismatchException e) {
            System.out.println("Введите целое число чтобы продолжить");
        }

            while (scr.hasNextLong()) {
                long asd = scr.nextInt();
                if (asd < 0)
                    System.out.println("Нет. Введите положительное число: ");
                else {
                    sum = asd + sum;
                    System.out.println("Сумма: " + sum);
                }

        }
    }
}
