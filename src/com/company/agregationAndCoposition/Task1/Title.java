package com.company.agregationAndCoposition.Task1;

public class Title {

    Sentence title;

    public Title(PartOfSentence... partOfSentences) {
        title = SentenceBuilder.toBuildASentence(partOfSentences);
    }

    public Sentence getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return title.getSentence();
    }
}
