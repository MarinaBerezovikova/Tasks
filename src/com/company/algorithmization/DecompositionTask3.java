package com.company.algorithmization;

public class DecompositionTask3 {

    public static double getSquareOfTriangle(double sideA) {
        return sideA * sideA * Math.sqrt(3) / 4; //Sides is equal
    }

    public static void main(String[] args) {

        double sideA = 5;
        double result = getSquareOfTriangle(sideA);
        double squareOfHexagon = result * 6;
        System.out.println("The square of right hexagon is " + squareOfHexagon);

    }
}
