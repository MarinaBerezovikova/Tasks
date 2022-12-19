package com.company.algorithmization;

import java.util.Arrays;

public class SortingTask1 {

    public static double[] uniting(double[] units, double[] deuces, int naturalNumberK) {

        int i, p = 0; //index of place for record

        double res[] = new double[units.length + deuces.length];


        for (i = 0; i < naturalNumberK; i++) {
            res[p++] = units[i];
        }

        for (i = 0; i < deuces.length; i++) {
            res[p++] = deuces[i];
        }

        for (i = naturalNumberK; i < units.length; i++) {
            res[p++] = units[i];
        }

        return res;
    }


    public static void main(String[] args) {

        double[] units = {1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7};
        double[] deuces = {2.0, 2.1, 2.2, 2.3, 2.4};
        int naturalNumberK = 3;

        System.out.println(Arrays.toString(units));
        System.out.println(Arrays.toString(deuces));

        System.out.println(Arrays.toString(uniting(units, deuces, naturalNumberK)));

    }
}
