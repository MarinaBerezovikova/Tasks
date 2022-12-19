package com.company.agregationAndCoposition.Task1;

public class Runner {

    public static void main(String[] args) {

        PartOfSentence word = new Word("I");
        PartOfSentence word1 = new Word("really");
        PartOfSentence word2 = new Word("change");
        PartOfSentence word3 = new Word("my");
        PartOfSentence word4 = new Word("life");
        PartOfSentence punctuation = new Punctuation("!");

        PartOfSentence word5 = new Word("I");
        PartOfSentence word6 = new Word("do");
        PartOfSentence word7 = new Word("one");
        PartOfSentence word8 = new Word("step");
        PartOfSentence punctuation1 = new Punctuation(",");
        PartOfSentence word9 = new Word("every");
        PartOfSentence word10 = new Word("day");
        PartOfSentence punctuation0 = new Punctuation("!");

        PartOfSentence wordOfHead = new Word("My");
        PartOfSentence wordOfHead0 = new Word("way");

        System.out.println("Let's create a new sentence from these words: ");

        Sentence sentence = SentenceBuilder.toBuildASentence(word5, word6, word7, word8, punctuation1, word9, word10, punctuation0);
        System.out.println(sentence.getSentence());

        Sentence sentence1 = SentenceBuilder.toBuildASentence(word, word1, word2, word3, word4, punctuation);

        System.out.println("We added a new sentence in the program:");
        System.out.println(sentence1.getSentence());

        Title title = new Title(wordOfHead, wordOfHead0);
        System.out.println("We created a title of text. ");
        TitleShower.ShowTitle(title);

        System.out.println("Let's to unite sentences to text: ");

        Text text = TextBuilder.toBuildAText(sentence, sentence1);
        TextShower.ShowText(text);
        System.out.println("-----");
        TextShower.ShowText(title, text);

        TextShower.ShowText(TextBuilder.addSentenceToText(text, new Sentence("It's cool!")));
    }
}
