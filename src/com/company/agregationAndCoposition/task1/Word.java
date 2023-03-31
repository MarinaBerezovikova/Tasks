package com.company.agregationAndCoposition.task1;

public class Word implements SentencePart {

    private final String word;

    public Word() {
        word = "";
    }

    public Word(String str) {
        word = str;
    }

    public String getWord() {
        return word;
    }

    @Override
    public StringBuilder getContent() {
        return new StringBuilder(this.word);
    }

    @Override
    public String toString() {
        return getWord();
    }
}