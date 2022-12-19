package com.company.algorithmization;


import java.util.Scanner;

public class DecompositionTask122 {

    public static int getGCDForTwoNumb(int a, int b) {
        if (b == 0)
            return a;
        else return getGCDForTwoNumb(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner("4 2 8");
        sc.useDelimiter(" ");
        int gcdResult = 0;
        while (sc.hasNextInt()) {
            gcdResult = gcdResult != 0 ? getGCDForTwoNumb(gcdResult, sc.nextInt()) : sc.nextInt();
        }
        System.out.println(gcdResult);
        sc.close();
    }
}

//да, там в сканер строка передается. чтобы вводить числа нужно придумать как выйти из цикла,
// gcd присваивается первое введенное, а дальше вроде все также.