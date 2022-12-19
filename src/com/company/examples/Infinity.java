package com.company.examples;

class Test {

    public static void main(String[] args) {
        int[] array = {122, 4, 5, 122, 1, 9, 5, 9};     // Объявление основного массива
        int[] arrayNew = new int[array.length];         // Объявление массива разных чисел
        int counterForArrayNew = 0;                     // Счетчик для массива разных чисел
        boolean checkTheSame = false;

        System.out.println("Исходный массив");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length; i++) {        // Начинаем поиск разных элементов основного массива
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] & i != j) {
                    checkTheSame = true;
                }
            }
            if (!checkTheSame) {
                arrayNew[counterForArrayNew++] = array[i]; // Сохраняем найденный элемент в новый массив
            }
            checkTheSame = false;

        }
        System.out.println();
        System.out.println("Новый массив:");
        for (int i = 0; i < arrayNew.length & arrayNew[i] != 0; i++) {
            System.out.print(arrayNew[i] + ", ");
        }
    }
}
