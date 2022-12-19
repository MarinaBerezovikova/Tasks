package com.company.agregationAndCoposition.Task1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<PartOfSentence> content = new ArrayList<PartOfSentence>();

    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return sentence;
    }
}
