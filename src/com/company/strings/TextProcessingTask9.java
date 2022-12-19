package com.company.strings;

public class TextProcessingTask9 {

    static String converterOfWord(String str) {
        return str.charAt(7) + str.substring(3, 5) + str.charAt(7);
    }

    public static void main(String[] args) {

        String wordBefore = "информатика";
        String wordAfter = converterOfWord(wordBefore);
        System.out.println(wordAfter);
    }
}