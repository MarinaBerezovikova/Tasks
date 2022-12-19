package com.company.strings;

import java.util.Scanner;

public class TextProcessingTask12 {
// Вводиться строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

//abc cde def ; aabbc cdee  dceff;

// also is processing the literals in UpperCase

    static String deleteDuplicatesOfSymbols(String inputString) {

        StringBuilder result = new StringBuilder();

        if (inputString == null || inputString.length() < 2) {
            return "Changes is not happened. The input string \"" + inputString + "\" is not valid.";
        } else {
            StringBuilder stringForChanges = new StringBuilder(inputString);
            String whiteSpace = " ";
            StringBuilder currentSymbol = new StringBuilder();

            for (int i = 0; i < stringForChanges.length(); i++) {
                currentSymbol.insert(0, inputString.charAt(i));
                if (i == 0) {
                    result.append(currentSymbol);
                } else {
                    if (result.indexOf(String.valueOf(currentSymbol)) == -1 &
                            (!currentSymbol.toString().equals(whiteSpace))) {
                        result.append(currentSymbol);
                    }
                }
                currentSymbol.setLength(0);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the text, please.");
        String text = scan.nextLine();
        System.out.println("This is your text before changes: " + text);
        deleteDuplicatesOfSymbols(text);
        System.out.println("This is your text after changes: " + deleteDuplicatesOfSymbols(text));

    }
}

//    static String deleteDuplicatesOfSymbols(String inputString) {
//
//        StringBuilder result = new StringBuilder();
//
//        if (inputString == null || inputString.length() < 2) {
//            return "The input string is not valid.";
//        } else {
//            StringBuilder stringForChanges = new StringBuilder(inputString);
//            String whiteSpace = " ";
//            String currentSymbol = "";
//
//            for (int i = 0; i < stringForChanges.length(); i++) {
//                currentSymbol = inputString.substring(i,i+1);
//                if (i == 0) {
//                    result.append(currentSymbol);
//                } else {
//                    if (result.indexOf(currentSymbol) == -1) {
//                        if (!currentSymbol.equals(whiteSpace))
//                            result.append(currentSymbol);
//                    }
//                }
//                currentSymbol = "";
//            }
//        }
//        return result.toString();
//    }