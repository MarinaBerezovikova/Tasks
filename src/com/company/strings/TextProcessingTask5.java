package com.company.strings;

public class TextProcessingTask5 {

    public static void main(String[] args) {

        String text = "   There are  a lot spaces     ,   enough  .    We are handed with it     ,  I'm sure  .   ";
        String regexp = "^ +| +$| +(?=[ ,.])";
        //To delete everything redundant spaces. It leaves one space after “.,”.
        // Need to remember that it doesn't add spaces if it needs.

        text = text.replaceAll(regexp, "");
        System.out.println(text);



    }
}
