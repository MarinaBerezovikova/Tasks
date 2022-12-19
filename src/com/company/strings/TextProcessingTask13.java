package com.company.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessingTask13 {

    public static String findTheBiggestWord(String text) {

        Pattern theBiggestWord = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = theBiggestWord.matcher(text);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            if (matcher.group().length() > result.length()) {
                if (result.length() != 0) {
                    result.setLength(0);
                }
                result.append(matcher.group());
            }
        }

        if (result.length() == 0) {
            System.out.println("Words not found.");
        }
        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the text, please.");
        String text = scan.nextLine();
        System.out.println(findTheBiggestWord(text));
    }
}
