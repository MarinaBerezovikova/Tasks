package com.company.lines;

import java.time.LocalTime;

public class LineTask5 {
    public static void main(String[] args) {

        int t = 12345;
        int h = t / 3600; // 3 полных часа
        int m = t / 60; // 205 полных минут
        int s = t - (m * 60); // 45 сек, 205 * 60 чтобы привести минуты к секундам
        int mf = (t - (h * 3600)) / 60; // 25 минут, часы превращаем снова в секунды, отнимаем от t и приводим к мин

        System.out.println((int) h + "ч " + mf + "мин " + s + "сек ");
    }
}

//        int hour = t / 3600;
//        int min = hour * 60;
// return min > 60 ? min/2 : min*1;
//
//

//        LocalTime time = LocalTime.ofSecondOfDay(t);
//        System.out.println(time);





