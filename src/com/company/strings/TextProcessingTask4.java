package com.company.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessingTask4 {

    public static int getCountОfNumbers(String str) {
// as additional function may a description, where the array doesn't have numbers + if the array equals null

        List<String> arrayStr = new ArrayList<String>();

        Pattern pattern = Pattern.compile("[\\d]+");
        Matcher matcher = pattern.matcher(str);

        int iResult = 0;
        while ((matcher.find())) {
            arrayStr.add(matcher.group());
            iResult++;
        }
        System.out.println(arrayStr);
        return iResult;
    }

    public static void main(String[] args) {

        String string1 = "1coffee 300; tea 500; cacao 350; coffee 456";
        String string2 = "coffee300;tea500;cacao350;coffee456jdfk45lj45lkj2611==6096 \n 45fg45\ngfg33";
        System.out.println("The count of numbers into string1 = " + getCountОfNumbers(string1));

        System.out.println("The count of numbers into string2 = " + getCountОfNumbers(string2));
    }
}


//        StringBuilder stringReview = new StringBuilder();  // deleting ';' from array
//        for (int i = 0; i < arrayStr.length; i++) {
//            if (arrayStr[i].indexOf(';') != -1) {
//                stringReview.append(arrayStr[i]);
//                stringReview.deleteCharAt(arrayStr[i].indexOf(';'));
//                arrayStr[i] = stringReview.toString();
//                stringReview.setLength(0);
//            }
//            System.out.println(arrayStr[i]);
//        }


