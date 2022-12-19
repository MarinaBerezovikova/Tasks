package com.company.strings;

import java.util.regex.*;

public class TextProcessingTask6 {
 // I changed spaces to dot for the visual comfort

    public static int findTheGreatestCountOfGaps(String str) {

        Pattern pattern = Pattern.compile("\\.+"); // \\s+ for the spaces
        Matcher matcher = pattern.matcher(str);

        String result = "";
        String buffer;

        if (str.contains(".")) {
            while (matcher.find()) {
                buffer = matcher.group();
                if (buffer.length() > result.length()) {
                    result = buffer;
                }
            }
        }
        if (result.length() == 0) {
            System.out.println("Dots not found.");
            return 0;
        }
        return result.length();
    }

    public static void main(String[] args) {

        String text = "one.two..three...four....five.....six......four....seven.......";
        String text1 = "dfdfdf";
        System.out.println("Count of matches: " + findTheGreatestCountOfGaps(text));
        System.out.println("Count of matches: " + findTheGreatestCountOfGaps(text1));
    }
}
