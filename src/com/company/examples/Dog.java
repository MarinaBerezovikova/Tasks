package com.company.examples;

public class Dog {
    public static void main(String[] args)  {

        String myString = "AkEMbszr";
        char[] charArray = myString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
                    swapChars(i, j, charArray);
                }
            }
        }
        System.out.println("Sorted string " + String.valueOf(charArray));

    }
    public static void swapChars(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
}