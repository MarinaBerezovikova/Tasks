package com.company.agregationAndCoposition.task1;

public class Runner {

    public static void main(String[] args) {

        SentencePart word = new Word("I");
        SentencePart word1 = new Word("really");
        SentencePart word2 = new Word("change");
        SentencePart word3 = new Word("my");
        SentencePart word4 = new Word("life");
        SentencePart punctuation = new Punctuation("!");

        SentencePart word5 = new Word("I");
        SentencePart word6 = new Word("do");
        SentencePart word7 = new Word("one");
        SentencePart word8 = new Word("step");
        SentencePart punctuation1 = new Punctuation(",");
        SentencePart word9 = new Word("every");
        SentencePart word10 = new Word("day");
        SentencePart punctuation0 = new Punctuation("!");

        SentencePart wordOfHead = new Word("My");
        SentencePart wordOfHead0 = new Word("way");

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

        System.out.println("In the end we will add one more sentence: ");
        TextShower.ShowText(TextBuilder.addSentenceToText(text, new Sentence("It's cool!")));
    }
}