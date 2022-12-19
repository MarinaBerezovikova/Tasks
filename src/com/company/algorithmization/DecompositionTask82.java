package com.company.algorithmization;

import java.util.Scanner;

public class DecompositionTask82 {
    public static boolean checkIndexes (int[] array, int fromIndex, int toIndex){
        // проверка на существование в длине массива переданных индексов
        if (fromIndex > array.length - 1 && toIndex > array.length - 1) {
            System.out.println("The inputted indexes are not exist. ");
        }

        // проверка на то, равны ли индексы
        if (fromIndex == toIndex) {
            System.out.println("The inputted indexes are equals, it's nоt apply. ");
        }

        // если индексы несут более 3 чисел (3-1=2)(1-3=-2)(5-2=3 неправ)
        if (fromIndex - toIndex != 2 && fromIndex - toIndex != -2) {
            System.out.println("The inputted indexes are provided more than three elements, it's nоt apply. ");
        }

        // если первый индекс больше чем второй = поменять местами
        if (fromIndex > toIndex) {
            fromIndex = fromIndex + toIndex;
            toIndex = fromIndex - toIndex;
            fromIndex = fromIndex - toIndex;
        }
        return true;
    }
    public static int getSumOfThreeElements(int[] array, int fromIndex, int toIndex) {

        return array[fromIndex] + array[fromIndex + 1] + array[toIndex];
    }

    public static void main(String[] args) {

        int[] arrayOfNumbers = {0, 1, 1, 1, 2, 2, 2, 3, 4}; //9

        Scanner scan = new Scanner (System.in);

        int k = scan.nextInt();
        int m = scan.nextInt();


        int result = getSumOfThreeElements(arrayOfNumbers, k, m);

        System.out.println(result);
    }
}
