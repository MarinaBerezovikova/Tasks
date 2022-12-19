package com.company.agregationAndCoposition.Task1;

import java.util.ArrayList;
import java.util.List;

public class TextShower {

    static StringBuilder listTextResult = new StringBuilder();
    static StringBuilder current;
    static List<Sentence> listText;

    static void ShowText(Title title, Text text) {
        TitleShower.ShowTitle(title);
        ShowText(text);
    }

    static void ShowText(Text text) {

        listText = new ArrayList<>(text.getText());

        for (Sentence sentence : listText) {

            current = new StringBuilder(sentence.toString());

            listTextResult.append(current).append(" ");
        }
        System.out.println("The text: " + listTextResult);
        listTextResult.setLength(0);
    }
}
