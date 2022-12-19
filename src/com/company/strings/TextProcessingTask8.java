package com.company.strings;

public class TextProcessingTask8 {
//The upper case and sentences are not processed.

    public static void isPalindrome(String str) {

        StringBuilder string0 = new StringBuilder(str);
        StringBuilder stringCheck = new StringBuilder(string0.reverse());

        if (stringCheck.toString().equals(str)) {
            String truePhrase = " is a palindrome.";
            System.out.println("The word " + str + truePhrase);
        } else {
            String falsePhrase = " is not a palindrome.";
            System.out.println("The word " + str + falsePhrase);
        }
    }

    public static void main(String[] args) {

        String palindrome = "madam";
        String nonPalindrome = "matcher";
        String nonPalindrome0 = "matchers";
        String palindrome0 = "civic";

        isPalindrome(palindrome);
        isPalindrome(nonPalindrome);
        isPalindrome(nonPalindrome0);
        isPalindrome(palindrome0);

    }
}
