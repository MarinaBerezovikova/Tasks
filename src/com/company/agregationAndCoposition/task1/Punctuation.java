package com.company.agregationAndCoposition.task1;

public class Punctuation implements SentencePart {

    private final String punctuation;

    public Punctuation(String str) {
        punctuation = str;
    }

    public String getPunctuation() {
        return punctuation;
    }

    @Override
    public StringBuilder getContent() {
        return new StringBuilder(this.punctuation);
    }

    public String toString() {
        return getPunctuation();
    }
}
