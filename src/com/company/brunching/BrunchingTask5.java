package com.company.brunching;

import java.util.Scanner;

public class BrunchingTask5 {
    public static void main(String[] args) {

        System.out.println("Введите, пожалуйста, число X: ");

//        Scanner input = new Scanner(System.in);
//        double x = input.nextDouble();

        double x = 4;

        if (x <= 3) {
            x = (Math.pow(x, 2)) - 3 * x + 9;
            System.out.println("Если X меньше или равен 3, то F(x) или Y равен " + x) ;
        } else { // x > 3
            x = 1/((Math.pow (x, 3)) + 6);
        System.out.println("Если X больше 3, то F(x) или Y равен " + x);
        }
    }
}

