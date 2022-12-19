package com.company.algorithmization;

import java.util.Scanner;

public class DecompositionTask2 {

    public static int getGreatestCommonDividerForTwoNumbers(int a, int b) {
        if (b == 0)
            return a;
        else return getGreatestCommonDividerForTwoNumbers(b, a % b);
    }

    public static int[] getArrayOfNumbers(int length, Scanner scan) {

        int[] numbers = new int[length];
        for (int index = 0; index < length; index++) {
            numbers[index] = getNumberWithScanner(scan);
        }
        return numbers;
    }

    public static int getNumberWithScanner(Scanner scan) {

        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        if (number < 1) {
            System.out.println("Enter the positive number, please.");
            getNumberWithScanner(scan);
            // can I not to creating variable the numbers?
        }
        return number;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How much numbers we need find CDN? ");
        int length = getNumberWithScanner(scan);

        System.out.println("Which numbers do you want to use? ");
        int[] array = getArrayOfNumbers(length,scan);

        int gcd = 0;
//        for (int i = 1; i < length; i++) {
//            if (i != 1) {
//                gcd = getGreatestCommonDividerForTwoNumbers(gcd, array[i]);
//            } else {
//                gcd = getGreatestCommonDividerForTwoNumbers(array[i - 1], array[i]);;
//            }
//        }
        for (int i = 1; i < length; i++) {
            if (i == 1) {
                gcd = getGreatestCommonDividerForTwoNumbers(array[i - 1], array[i]);
            } else {
                gcd = getGreatestCommonDividerForTwoNumbers(gcd, array[i]);
            }
        }
        System.out.println("The great common divider is: " + gcd);
        scan.close();
    }
}
