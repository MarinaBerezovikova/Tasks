package com.company.lines;

public class LineTask3 {
    public static void main(String[] args) {

        double x = 40;
        double y = 50;

        double res5 = (Math.sin(x)) + (Math.cos(y));
        double res6 = (Math.cos(x)) - (Math.sin(y));
        double res7 = (Math.tan(x * y));
        double res8 = (res5 / res6) * res7;

        System.out.println((int) res8);
    }
}
