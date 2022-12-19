package com.company.algorithmization;

import java.util.Arrays;
import java.util.Scanner;

public class SortingTask3 {

    public static int[] getArrayOfNumbersUsingScannerInt() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the number for array length: ");
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            if (i == 0) {
                System.out.println("Put the first number for array: ");
            } else {
                System.out.println("Put the number, that this number would have the same value or more than previous: ");
            }
            array[i] = scanner.nextInt();
            while (i > 0 && (array[i] < array[i - 1])) {
                System.out.println("Put the correct number (it should be a number that has the same value or more than previous): ");
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }

    public static void sortingDescendingUsingChoose(int[] array) { //Descending

        int max, temp;
        for (int i = 0; i < array.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    temp = array[max];                          //exchange
                    array[max] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sortingAscendingUsingChoose(int[] array) { //Ascending

        int min, temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    temp = array[min];                          //exchange
                    array[min] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] items = getArrayOfNumbersUsingScannerInt();
        System.out.println(Arrays.toString(items));

//        int[] itemsTest = {5, 3, 6, 1, 2, 4};
        sortingDescendingUsingChoose(items);
        System.out.println(Arrays.toString(items));

        sortingAscendingUsingChoose(items);
        System.out.println(Arrays.toString(items));
    }
}


