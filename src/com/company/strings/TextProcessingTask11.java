package com.company.strings;

public class TextProcessingTask11 {
// Из заданной строки получить новую, повторив каждый символ дважды.

    public static void oneSymbolToTwice(String str) {

        StringBuilder stringForWork = new StringBuilder(str.length()*2);
        stringForWork.append(str);

        int index = 0;

        while (index <stringForWork.length()) {
            stringForWork.insert(index, stringForWork.charAt(index));
            index += 2;
        }
        System.out.println(str = stringForWork.toString());
    }

    public static void main(String[] args) {

        String aRule = "The ordinary string.";
        String newString = "";
        oneSymbolToTwice(aRule);

        System.out.println(newString);
    }
}

//    public static String oneSymbolToTwice(String str) {
//
//        StringBuilder stringForWork = new StringBuilder();
//
//        int index = 0;
//        int length = stringForWork.length() * 2;
//
//        while (index < length) {
//            stringForWork.insert(index, stringForWork.charAt(index));
//            index += 2;
//        }
//        return stringForWork.toString();
//    }

//public static String oneSymbolToTwice(String str) {
//
//    StringBuilder stringForWork = new StringBuilder(str.length()*2);
//    stringForWork.append(str);
//
//    int index = 0;
//
//    while (index <stringForWork.length()) {
//        stringForWork.insert(index, stringForWork.charAt(index));
//        index += 2;
//    }
//    return stringForWork.toString();
//}