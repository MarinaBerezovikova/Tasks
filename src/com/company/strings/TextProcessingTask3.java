package com.company.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessingTask3 {

    public static int getCountOfDigit(String str) {
        int count = 0;

        Pattern pat = Pattern.compile("([\\d])");
        Matcher match = pat.matcher(str);
        int i = 0;

        if (match.find()) count++;
        else return -1;

        while (match.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        String[] arrayString = {"ee 1",
                "1coffee 234; tea 567; cacao 89; coffee ",
                "coffee300;tea500;cacao350;coffee456jdk45lj45lkj2611==6096 \n 45fg45\ngfg33",
                "coffee ; tea ; cacao ; coffee"};

        String expressionElFounded = "The common count of digits: ";
        String expressionElNotFound = "Matches didn't found.";

        for (String s : arrayString) {
            if (getCountOfDigit(s) == -1) {
                System.out.println(expressionElNotFound);
            } else {
                System.out.println(expressionElFounded + getCountOfDigit(s));
            }
        }
    }
}
