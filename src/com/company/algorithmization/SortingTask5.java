package com.company.algorithmization;


import java.util.Arrays;

public class SortingTask5 {

    public static void insertionSort(int[] array) {

        for (int index = 1; index < array.length; index++) { // по возрастанию
            int current = array[index];
            int j = index-1;
            int locationForElement = binarySearch(array, 0, j, array[index]);
            while (j >= locationForElement) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static int binarySearch(int[] array, int fromIndex, int toIndex, int key) {

        while (fromIndex <= toIndex) {
            int middle = (fromIndex + toIndex) / 2; // >>> 1?
            if (array[middle] < key) {
                fromIndex = middle + 1;
            } else if (array[middle] > key) {
                toIndex = middle - 1;
            } else return middle; // key found
        }
        return fromIndex; // key not found.
    }


    public static void main(String[] args) {

        final int[] numbers = {5, 3, 6, 1, 2, 4}; // 519352
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
//    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
//                                     int key) {
//        int low = fromIndex;
//        int high = toIndex - 1;
//
//        while (low <= high) {
//            int mid = (low + high) >>> 1;
//            int midVal = a[mid];
//
//            if (midVal < key)
//                low = mid + 1;
//            else if (midVal > key)
//                high = mid - 1;
//            else
//                return mid; // key found
//        }
//        return -(low + 1);  // key not found.