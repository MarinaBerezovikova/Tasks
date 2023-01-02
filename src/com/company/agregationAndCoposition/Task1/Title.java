package com.company.agregationAndCoposition.Task1;

public class Title {

    Sentence title;

    public Title(SentencePart... sentenceParts) {
        title = SentenceBuilder.toBuildASentence(sentenceParts);
    }

    public Sentence getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return title.getSentence();
    }
}
