package com.company.brunching;

public class BrunchingTask1 {
    public static void main(String[] args){

    int cornerOne = 60;
    int cornerTwo = 30;

    if ((cornerOne + cornerTwo) < 180)       {
        if (cornerOne <= 0 || cornerTwo <= 0)
            System.out.println("Треугольник не существует");
        else
            System.out.println("Треугольник существует");
    }
    if (cornerOne + cornerTwo == 90 ||cornerOne == 90 || cornerTwo == 90 ) {
        System.out.println("К тому же он прямоугольный");
    }
}
}

