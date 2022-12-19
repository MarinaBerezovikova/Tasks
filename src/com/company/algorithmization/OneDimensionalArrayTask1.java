package com.company.algorithmization;

public class OneDimensionalArrayTask1 {
    public static void main(String[] args) {

        int[] numbers = new int[20];

        int sum = 0;
        int divider = 2; // кратно 2

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length + 1; i++) {
            if (numbers [i] % divider == 0) {
                sum += numbers [i]; // сокращение от sum = sum + numbers [i];
            }
        }
        System.out.println(sum);
    }
}
