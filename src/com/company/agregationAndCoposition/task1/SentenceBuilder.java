package com.company.agregationAndCoposition.task1;

import java.util.*;
import java.util.regex.Pattern;

public class SentenceBuilder {

    public static String regexpOfWord = "\\w+";

    static Sentence toBuildASentence(SentencePart... partsOfSentence) {

        List<StringBuilder> sentence = new ArrayList<>();
        Arrays.stream(partsOfSentence).forEach(partOfSentence -> sentence.add(partOfSentence.getContent()));

        ListIterator<StringBuilder> iterator = sentence.listIterator();

        boolean nextIsWord;
        StringBuilder result = new StringBuilder();
        StringBuilder previous = new StringBuilder();
        StringBuilder current;

        if (iterator.hasNext()) {
            previous = iterator.next();
        }
        while (iterator.hasNext()) {
            current = iterator.next();
            result.append(previous);

            nextIsWord = Pattern.matches(regexpOfWord, current);

            if (nextIsWord) {
                result.append(" ");
            }
            if (!iterator.hasNext()) {
                result.append(current);
                break;
            }
            previous = current;
        }
        return new Sentence(result.toString());
    }
}
