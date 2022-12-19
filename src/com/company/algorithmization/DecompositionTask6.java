package com.company.algorithmization;

public class DecompositionTask6 {

    //Взаимно простые числа — целые числа, не имеющие никаких общих делителей, кроме ±1.
    // Равносильное определение[1]: целые числа взаимно просты,
    // если их наибольший общий делитель (НОД) равен 1.

    public static int calculateTheGreatestCommonDivider(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return calculateTheGreatestCommonDivider(b, (a % b));
        }
    }

    static boolean checkIsCoPrimeNumbers(int[] array) {

        int gcd = 0;
        for (int i = 1; i < array.length; i++) {
            if (i == 1) {
                gcd = calculateTheGreatestCommonDivider(array[i - 1], array[i]);
            } else {
                gcd = calculateTheGreatestCommonDivider(gcd, array[i]);
            }
        }
        return gcd == 1; // передается выражение
    }

    public static void main(String[] args) {

        int[] numbers = {15, 25, 70};
        int[] numbers2 = {5, 9, 8};
//        checkIsCoPrimeNumbers(numbers2); checkIsCoPrimeNumbers(numbers)

        boolean answer = checkIsCoPrimeNumbers(numbers2);

//        if (answer) {
//            System.out.println("The inputted numbers are сo-prime.");
//        } else {
//            System.out.println("The inputted numbers aren't сo-prime.");
//        }

        String rs;
        String truth = "The inputted numbers are сo-prime.";
        String lie = "The inputted numbers aren't сo-prime.";
        rs = answer ? truth : lie;
        System.out.println(rs);
    }
}



