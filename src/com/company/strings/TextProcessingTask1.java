package com.company.strings;

import java.util.Arrays;
import static java.lang.Character.toLowerCase;

// Дан массив названий переменный в CamelCase. Преобразовать названия в snake_case.
public class TextProcessingTask1 {

    public static void main(String[] args) {

        String[] names = {"nameNamesNamesAlla", "camelCase", "akemiYori"};

        int i = 0;

        while (i < names.length) {
            String name = names[i];

            char element;
            for (int j = 0; j < name.length(); j++) {
                element = name.charAt(j);
                if (Character.isUpperCase(element)) {
                    name = name.replaceFirst("[A-Z]", "_" + toLowerCase(element));
                }
            }
            names[i] = name;
            i++;
        }
        System.out.println(Arrays.toString(names));
    }
}







