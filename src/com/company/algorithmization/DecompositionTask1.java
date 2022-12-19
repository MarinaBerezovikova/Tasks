package com.company.algorithmization;

import java.util.Scanner;

public class DecompositionTask1 {

    public static int getNumberWithScanner() { //написать проверку если не число и не положительное

        System.out.println("Lets input a number: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static int getGreatestCommonDivider(int a, int b) { //Euclid

        if (b == 0) {
            return a;
        } else return getGreatestCommonDivider(b, a % b);
    }

    public static int getLeastCommonMultiple(int a, int b) {
        return (a * b) / getGreatestCommonDivider(a, b);
    }

    public static void main(String[] args) {

        int aNumber = getNumberWithScanner();
        int bNumber = getNumberWithScanner();

        System.out.println("The greatest common divider of first and second numbers is: " +
                getGreatestCommonDivider(aNumber, bNumber));
        System.out.println("The least common multiple of first and second numbers is: " +
                getLeastCommonMultiple(aNumber, bNumber));
    }
}
