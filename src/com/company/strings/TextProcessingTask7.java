package com.company.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessingTask7 {

    public static String inputSymbolAfterSymbol(String string) {
// also is processing the literals in UpperCase

        StringBuilder stringForChanges = new StringBuilder(string);

        Pattern symbolA = Pattern.compile("[a]"); // check on "a" symbol
        Matcher matcher = symbolA.matcher(string);

        if (matcher.find()) { // to check for existing 'a'
            char element;
            for (int indexElement = 0; indexElement < stringForChanges.length(); indexElement++) {
                element = stringForChanges.charAt(indexElement);
                if (element == 'a' || element == 'A') {
                    stringForChanges.insert(indexElement + 1, "b");
                }
            }
        } else {
            return "The string is not consist symbol 'a'.";
        }
        string = String.valueOf(stringForChanges);
        return string;
    }

    public static void main(String[] args) {

        String text = "/a/649839fa rjfaapeu aa aelha0 Aaaaa";
        String text1 = "a/ab/a/aa/b/";
        String text2 = "f/d/d/ff/bb/";

        System.out.println(inputSymbolAfterSymbol(text));

    }
}
//    public static String inputSymbolAfterSymbol(String string) {
//// also is processing the literals in UpperCase
//
//        StringBuilder stringForChanges = new StringBuilder(string);
//
//        Pattern symbolA = Pattern.compile("[a]"); // check on "a" symbol
//        Matcher matcher = symbolA.matcher(string);
//
//        if (matcher.find()) {
//            char element;
//            for (int indexElement = 0; indexElement < stringForChanges.length(); indexElement++) {
//                element = stringForChanges.charAt(indexElement);
//                if (element == 'a' || element == 'A') {
//                    stringForChanges.insert(indexElement + 1, "b");
//                }
//            }
//        } else {
//            return "The string is not consist symbol 'a'.";
//        }
//        string = String.valueOf(stringForChanges);
//        return string;
//    }