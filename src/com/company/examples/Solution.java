package com.company.examples;

import java.util.Arrays;

public class Solution {

    int addTwoNumbers (int a, int b) {
        return a+b;
    }

    public static int main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] copied = new int[10];
        System.arraycopy(arr, 0, copied, 2, 4);//5 is the length to copy

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copied));
    return arr.length;}
}
