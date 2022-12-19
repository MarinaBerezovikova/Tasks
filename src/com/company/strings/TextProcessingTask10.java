package com.company.strings;

public class TextProcessingTask10 {

    public static void main(String[] args) {

        String text1 = "a/ab/a/aa/b/";

        char element;
        int result = 0;
        for (int i = 0; i < text1.length(); i++) {
            element = text1.charAt(i);
            if (element == 'a') {
                result++;
            }
        }
        System.out.println("The count of 'a' character is " + result);

    }
}
