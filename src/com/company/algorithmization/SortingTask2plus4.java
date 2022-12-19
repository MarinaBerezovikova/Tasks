package com.company.algorithmization;

import java.util.Arrays;

public class SortingTask2plus4 {

    public static int[] toUniteArrays(int[] array1, int[] array2) {

        int[] unitedArrays = new int[array1.length + array2.length];

        // если длины массивов равны
//        for (int i = 0; i < array1.length; i++) {
//            unitedArrays[i] = array1[i];
//            unitedArrays[array1.length + i] = array2[i];
//        }

        //если массивы разной длины

      /*  for (int i = 0; i < array1.length; i++) {
            unitedArrays[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            unitedArrays[array1.length + i] = array2[i];
        }*/

        System.arraycopy(array1, 0, unitedArrays, 0, array1.length); // с этим работает быстрее
        System.arraycopy(array2, 0, unitedArrays, array1.length, array2.length);

        return unitedArrays;
    }

    public static void sortOfBubble(int[] array1) {

        boolean needSorting = true;
        int changes = 0;

        while (needSorting) {
            needSorting = false;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    array1[i] = array1[i] + array1[i + 1];
                    array1[i + 1] = array1[i] - array1[i + 1];
                    array1[i] = array1[i] - array1[i + 1];
                    changes++;
                    needSorting = true;
                }
            }
        }
        if (changes != 0) {
            System.out.println("Numbers of changes: " + changes);
        } else { System.out.println("The array is already sorted. We didn't have changes in the time of sorting.");

        }

    }

    public static void main(String[] args) {

        int[] numbOne = {1, 3, 5, 7, 9};
        int[] numbTwo = {2, 4, 6, 8};

        int[] result = toUniteArrays(numbOne, numbTwo);

        System.out.println("We united two arrays this way: " + Arrays.toString(result));

        sortOfBubble(result);
        System.out.println("We sorted array from \"Sorting of bubble\" two arrays this way: " + Arrays.toString(result));
    }
}