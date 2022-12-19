package com.company.lines;

public class LineTask2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 10;

        double res1 = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c));
        double res2 = 2 * a;
        double res3 = (Math.pow(a, 3) + Math.pow(b, -2));
        double res4 = res1 / res2 - res3;

        System.out.println((int) res4);

    }
}
