package com.company.strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithRegex2 {

    public static String OPENING_TAG = "<\\w+>";
    public static String CLOSING_TAG = "</\\w+>";
    public static String CONTENT = "<\\w+>(.*)</\\w+>"; //group 1 // (?:<\w+>)(.*)(?:<\/\w+>) group 1 ???
    public static String ATTRIBUTE = "(<\\w+)\\s+(\\w+)\\s+=\\s+\"(.*)\">";
    public static String EMPTY_TAG = "<\\w+/>";

    public static String fileReader() {

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\notes.xml"));
        } catch (FileNotFoundException e) {
            System.out.println("For input was passed a non-existed file. Program is closing.");
            e.printStackTrace();
        }
        String file;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            while ((file = bufferedReader.readLine()) != null) {
                stringBuilder.append(file.trim()).append("\n");
            }
        } catch (IOException e) {
            System.out.println("In process appeared some problem. A specific description is below.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("In process appeared some problem. A specific description is below.");
        }
        return stringBuilder.toString();
    }

    public static String analyserXml(String fileXml) {

        Pattern patternOT = Pattern.compile(OPENING_TAG);
        Matcher matcherOT = patternOT.matcher(fileXml);

        Pattern patternCT = Pattern.compile(CLOSING_TAG);
        Matcher matcherCT = patternCT.matcher(fileXml);

        Pattern patternCon = Pattern.compile(CONTENT);
        Matcher matcherCon = patternCon.matcher(fileXml);

        Pattern patternAt = Pattern.compile(ATTRIBUTE);
        Matcher matcherAt = patternAt.matcher(fileXml);

        Pattern patternET = Pattern.compile(EMPTY_TAG);
        Matcher matcherET = patternET.matcher(fileXml);


        return "";
    }

    public static void main(String[] args) {

        String xmlInput = fileReader();
        System.out.println(xmlInput);

    }
}






/*
        FileReader fr = new FileReader("C:\\notes.xml");

        int i;

        // Reads from the file
        while ((i = fr.read()) != -1) {

            // Printing  the content inside the file
            System.out.print((char)i);
        }

        // Closing the connections to
        // avoid memory space
        fr.close();
    }
    String xml = "<notes>\n" +
            "<note id = \"1\">\n" +
            "<to>вася</to>\n" +
            "<from>света</from>\n" +
            "<heading>напоминание</heading>\n" +
            "<body>позвони мне завтра!</body>\n" +
            "</note> <note id = \"2\">\n" +
            "<to>петя</to>\n" +
            "<from>маша</from>\n" +
            "<heading>важное напоминание</heading>\n" +
            "<body/> \n" +
            "</note>\n" +
            "</notes>";


             public static String OPENING_TAG = "<\\w+>";
    public static String CLOSING_TAG = "<\\/\\w+>";
    public static String CONTENT = "<\\w+>(.*)<\\/\\w+>"; //group 1 // (?:<\w+>)(.*)(?:<\/\w+>) group 1 ???
    public static String ATTRIBUTE = "(<\\w+)\\s+(\\w+)\\s+=\\s+\\\"(.*)\\\">";
    public static String EMPTY_TAG = "<\\w+\\/>";
*/


