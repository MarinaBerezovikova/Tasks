package com.company.strings;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class WorkWithRegex1 {

// Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три операции:
// 1. отсортировать абзацы по количеству предложений; (сортирует по возрастанию)
// 2. в каждом предложении отсортировать слова по длине; (сортирует по возрастанию)
// 3. отсортировать лексемы (любая часть языка, любое слово) в предложении (одном предложении) по убыванию количества вхождения заданного символа,
// а в случае равенства - по алфавиту

    public static final String SPLIT_PARAGRAPHS = "\\r\\n|\\n|\\r";
    public static final String SPLIT_SENTENCES = "(?<=\\w[.!?] )|(?<=[!.?]\\n)";
    public static final String SPLIT_WORDS = "[^\\w]+";

    public static int countOfEntries(String word, char character) { // кол-во вхождений символа + заглавные
        String str = word.toLowerCase();
        str = str.replaceAll(String.valueOf(character), "");
        return (word.length() - str.length());
    }

    public static ArrayList<String> addValues(ArrayList<String> array, String string) {
        array.add(string);
        return array;
    }

    public static void sortingWordsByAlphabetByMap(ArrayList<String> words, char symbol) {

        Map<Integer, ArrayList<String>> hashMap = new HashMap<>(); //capacity of map
        Iterator<String> iterator = words.iterator();
        Integer currentEntries;
        String currentWord;

        while (iterator.hasNext()) {
            currentWord = iterator.next();
            currentEntries = countOfEntries(currentWord, symbol);

            if (!hashMap.containsKey(currentEntries)) {
                hashMap.put(currentEntries, addValues(new ArrayList<>(), currentWord));
            } else if (hashMap.containsKey(currentEntries)) {
                hashMap.put(currentEntries, addValues(hashMap.get(currentEntries), currentWord));
            }
        }

//        for (Map.Entry<Integer, ArrayList<String>> entry : hashMap.entrySet()) {
//            Integer integer = entry.getKey();
//            ArrayList<String> ArrayList = entry.getValue();
//            Collections.sort(ArrayList);
//        }
        hashMap.forEach((integer, ArrayList) -> Collections.sort(ArrayList));

        System.out.println(hashMap);
    }

    public static void sortingWordsByAlphabet(ArrayList<String> words, char symbol) {

        ArrayList<String> temporarySequence = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        int currentEntries = 0;

        for (int i = 0; i < words.size(); i++) {

            if (temporarySequence.size() == 0) {
                temporarySequence.add(words.get(i));
                currentEntries = countOfEntries(temporarySequence.get(0), symbol);
            }
            if (i == words.size() - 1 && temporarySequence.size() == 1) {
                result.add(temporarySequence.get(0));
                break;
            } else if (i == words.size() - 1 && temporarySequence.size() > 1) {
                temporarySequence.add(words.get(i));
                Collections.sort(temporarySequence);
                result.addAll(temporarySequence);
                break;
            }
            if (currentEntries == countOfEntries(words.get(i + 1), symbol)) {
                temporarySequence.add(words.get(i + 1));
            } else if (temporarySequence.size() == 1) {
                result.add(temporarySequence.get(0));
                temporarySequence.clear();
            } else {
                Collections.sort(temporarySequence);
                result.addAll(temporarySequence);
                temporarySequence.clear();
            }
        }
        System.out.println(result);
    }

    private static int getIntWithVerification(Scanner scan, int length) throws InputMismatchException {

        int numberOfSentence = 0;
        try {
            numberOfSentence = scan.nextInt() - 1; // "-1" a remark by length of array

        } catch (InputMismatchException e) {
            scan.next();
            System.out.println("A sentence with symbol you inputted didn't exist. Input the another number of sentence for sorting:");
            getIntWithVerification(scan, length);

        } finally {
            if (numberOfSentence < 0 || numberOfSentence >= length) {
                System.out.println("A sentence with number you inputted didn't exist. Input the another number of sentence for sorting:");
                getIntWithVerification(scan, length);
            }
        }
        return numberOfSentence;
    }

    // part 3
    public static void sortingWordsInSentenceOnCountOfEntriesChar(String text, Scanner scan) {

        String[] sentences = text.split(SPLIT_SENTENCES);

        System.out.println("Text has " + sentences.length + " sentences.\n Input the number of sentence for sorting:");

        int numberOfSentence = getIntWithVerification(scan, sentences.length);

        String[] sentence = sentences[numberOfSentence].split(SPLIT_WORDS);
        for (int i = 0; i < sentence.length; i++) { // cast all elements to the lower case
            sentence[i] = sentence[i].toLowerCase();
        }
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(sentence));

        // getting the char for sorting
        System.out.println("Input, please, one symbol for sorting the words: ");
        char symbolForSort = scan.next().charAt(0);
        scan.close();

        int min, positionOfMin, current;
        String temp;

        for (int i = 0; i < words.size() - 1; i++) {
            min = countOfEntries(words.get(i), symbolForSort);
            if (min == 0) continue;
            positionOfMin = i;
            for (int j = i + 1; j < words.size(); j++) {
                current = countOfEntries(words.get(j), symbolForSort);
                if (current < min) {
                    min = current;
                    positionOfMin = j;
                }
            }
            // Swap the words
            temp = words.get(positionOfMin);
            words.set(positionOfMin, words.get(i));
            words.set(i, temp);
        }

        // sort by alphabet
        sortingWordsByAlphabetByMap(words, symbolForSort);
    }

    // part 2
    public static void sortingWordsOnLengthInSentences(String text) {
        String[] sentences = text.split(SPLIT_SENTENCES);

        String temp;
        String[] words;
        for (String sentence : sentences) {
            words = sentence.split(SPLIT_WORDS);

            //sorting
            for (int i = 1; i < words.length; i++) {
                temp = words[i];
                int keyLength = words[i].length();
                int j = i - 1;

                while (j >= 0 && words[j].length() > keyLength) {
                    words[j + 1] = words[j];
                    j = j - 1;
                }
                words[j + 1] = temp;
            }
            System.out.println(Arrays.toString(words));
        }
    }

    // part 1
    public static void sortingParagraphOnCountSentences(String text) {

        String[] paragraphsArray = text.split(SPLIT_PARAGRAPHS);
        String[][] paragraphsAndSentences = new String[paragraphsArray.length][];

        // filling dimensional array: strings = paragraphs, columns = sentences
        for (int i = 0; i < paragraphsArray.length; i++) {
            paragraphsAndSentences[i] = paragraphsArray[i].split(SPLIT_SENTENCES);
        }

        // sorting paragraphs
        for (int i = 1; i < paragraphsArray.length; i++) {
            String[] key = paragraphsAndSentences[i];
            int j = i - 1;

            while (j >= 0 && paragraphsAndSentences[j].length > key.length) {
                paragraphsAndSentences[j + 1] = paragraphsAndSentences[j];
                j = j - 1;
            }
            paragraphsAndSentences[j + 1] = key;
        }

        // to print the result, the sentences not uniting in a text or a paragraph
        for (String[] array : paragraphsAndSentences) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {

        String text = "When we make tea and coffee we use energy: gas, electricity and coal. Global warming comes from energy we use. So each time we make a cup of tea we make a problem for our world. People drink 229 million cups of tea and coffee every day. We should save the energy we use to make tea and coffee.\n" +
                "If we want three cups of tea, we should put three cups of water in the kettle.\n" +
                "But often we put in five or six cups of water. We use 90 seconds more for a kettle with three cups than for a kettle with one cup.\n" +
                "So each time we use a kettle we should save energy. We should think: how many cups do I want? Water is a problem too. How can we save energy, save water and be healthy?";

        System.out.println("Welcome to program of work with text. ");

//        TimeUnit.SECONDS.sleep(1);
        System.out.println("\nWe have the follow text: ");
        System.out.println(text);
//        TimeUnit.SECONDS.sleep(1);

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter the number of operation for further work: \n Sort paragraph by count sentences = 1 \n Sort words by length in sentences = 2 \n Sorting words in a chosen sentence on count of entries symbol = 3");

        int numOfOperation = scan.nextInt();

        switch (numOfOperation) {
            case 1:
                System.out.println("You chose the operation of sorting paragraph by count sentences. \n The processing result: ");
                sortingParagraphOnCountSentences(text);
                break;

            case 2:
                System.out.println("You chose the operation of sorting words by length in sentences. \n The processing result: ");
                sortingWordsOnLengthInSentences(text);
                break;

            case 3:
                System.out.println("You chose the operation of sorting words in a chosen sentence on count of entries symbol. (This processing also support a sort by alphabet with elements the same count of symbol). ");
                sortingWordsInSentenceOnCountOfEntriesChar(text, scan);
            default:
                break;
        }
    }
}
//    String test0 = "w4ord! w4ord. w4ord. w4ord.\n" +
//            "w2ord. w2ord.\n" +
//            "w1ord.\n" +
//            "w3ord. w3ord. w3ord?\n" +
//            "w5ord. w5ord. w5ord. w5ord. w5ord!";
//
//    String test2 = "abcd ab abcd abc abc abcdef ab abc abcdef, ab abc. Abc abcde ab abc ab abcd ab.";
//    String test3 = "";
//    String test4 = "Abb baa acb cba aaa cab bbc. Abb baaaa acb cba aaa cab bbc abc  af ac ag ad aa ae af ag.";
//String test = "When we make tea and coffee we use energy: gas, electricity and coal. Global warming comes from energy we use. So each time we make a cup of tea we make a problem for our world. People drink 229 million cups of tea and coffee every day. We should save the energy we use to make tea and coffee.\n" +
//        "If we want three cups of tea, we should put three cups of water in the kettle.\n" +
//        "But often we put in five or six cups of water. We use 90 seconds more for a kettle with three cups than for a kettle with one cup.\n" +
//        "So each time we use a kettle we should save energy. We should think: how many cups do I want? Water is a problem too. How can we save energy, save water and be healthy?";
//