package com.company.agregationAndCoposition.task1;

import java.util.ArrayList;
import java.util.List;


public class Text {

    private List<Sentence> text = new ArrayList<>();

    public Text() {
        this.text = new ArrayList<>();
    }

    public Text(Sentence... sentences) {
        TextBuilder.toBuildAText(sentences);
    }

    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }

    public List<Sentence> getText() {
        return text;
    }
}
