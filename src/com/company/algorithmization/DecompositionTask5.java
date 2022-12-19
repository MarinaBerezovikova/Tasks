package com.company.algorithmization;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class DecompositionTask5 {

    public static ArrayList<Double> fillArrayListRandomsNumbers(ArrayList<Double> list) {

        for (int i = 0; i < 10; i++) { //10 is random number
            list.add(i, Math.random() * 10);
        }
        return list;
    }

    public static double getSecondNumberAfterTheBiggest(ArrayList<Double> list) {

        Collections.sort(list);
        return list.get(list.size() - 2);
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");  //output two numbers after delimiter

        ArrayList<Double> list = new ArrayList<Double>();
        System.out.println(df.format(getSecondNumberAfterTheBiggest(fillArrayListRandomsNumbers(list))));


    }

}
