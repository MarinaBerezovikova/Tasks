package com.company.algorithmization;

import java.util.Arrays;

public class TwoDimensionalArrayTask1 {

    public static void main(String[] args) {

        System.out.println("We have the two-dimensional array. It looks like here: ");
        int[][] numbers = new int[10][3];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) { // -1
                numbers[i][j] = (int) (Math.random() * 10);
                System.out.print(numbers[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Arrays that has even number at first element of array and also " +
                "the first element of array more that the last element: ");

        for (int i = 0; i < numbers.length; i++) { //поставила сначала проверку столбика, так как так меньше требует физ проверок
            if (i % 2 == 0) {
                if (numbers[i][0] > numbers[i][numbers[i].length-1])
                    System.out.println(Arrays.toString(numbers[i]));
            }
        }
    }
}
