package com.company.algorithmization;

import java.util.ArrayList;
import java.util.Arrays;

public class DecompositionTask4 {
    // можно доделать сканер для ввода координат точек XY
    // если отрезок между точками равен, тогда что? проверка?
    // сколько точек вы имеете - длина массива, запись (добавить диалог?)
    // Сделать адекватную длину для резалт +
    // можно попробовать исп эррей лист +


    public static double calculateDistanceBetweenPoints(double pointX, double pointX2, double pointY, double pointY2) {
        return Math.sqrt(Math.pow((pointX2 - pointX), 2) + Math.pow((pointY2 - pointY), 2));
    }

    public static ArrayList<Double> getListDistances(double[] arrayX, double[] arrayY) {

        ArrayList<Double> result = new ArrayList<>();

        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX.length; j++) {
                if (!(i == j)) {
                    result.add(calculateDistanceBetweenPoints(arrayX[i], arrayX[j], arrayY[i], arrayY[j]));
                }
            }
        }
        result.trimToSize();
        return result;
    }
    // не учитывает одинаковые расстояния между точками
    public static double findTheBiggestDistance(ArrayList<Double> distances) {
        double max = distances.get(0);
        for (int i = 1; i < distances.size(); i++) {
            if (max < distances.get(i)) {
                max = distances.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {

        double[] xxx = {0.0, 4.0, 1.0, -5.0};
        double[] yyy = {3.0, 5.0, -3.0, -3.0};

        ArrayList<Double> distancesList = new ArrayList<>(getListDistances(xxx, yyy));
        double resultValue = findTheBiggestDistance(distancesList);
        System.out.println(Arrays.toString(distancesList.toArray()));
        System.out.println(resultValue);
    }
}
