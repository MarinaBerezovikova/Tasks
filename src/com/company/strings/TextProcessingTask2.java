package com.company.strings;

public class TextProcessingTask2 {

    public static void main(String[] args) {

        String text = "I was writing him a word twice a day and went to the post." +
                " \nThen, I said, that this word should be sent as soon as fast. \nI've seen up on word the last time " +
                "and threw it in postbox.";
        System.out.println(text.replaceAll("\\b[word]{4}\\b", "letter"));
    }
}
