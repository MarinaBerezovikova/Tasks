package com.company.agregationAndCoposition.Task1;

import java.util.Arrays;

public class TextBuilder {

    static public Text addSentenceToText(Text text, Sentence sentence) {
        text.getText().add(sentence);
        return text;
    }

    static public Text toBuildAText(Sentence... sentences) {
        Text text = new Text();
        Arrays.stream(sentences).forEach(sentence -> text.getText().add(sentence));

        return text;
    }
}