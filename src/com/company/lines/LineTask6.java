package com.company.lines;

import java.util.Scanner;

public class LineTask6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if ((-2 <= x && x <= 2) && (0 <= y && y <= 4)) {
            System.out.println("true");
        } else if ((-4 <= x && x <= 4) && (-3 <= y && y <= 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}