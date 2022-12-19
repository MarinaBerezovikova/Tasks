package com.company.classes.Task6;

public class Runner {
    public static void main(String[] args) {

        Time time1 = new Time();
        TimeChanger timeChanger = new TimeChanger();

        time1.setHour(23);
        time1.setMinute(60);
        time1.setSecond(40);

        System.out.println("default value");
        System.out.println(time1);

        System.out.println("+ 4h");
        timeChanger.addTime(time1, 4);
        System.out.println(time1);

        System.out.println("+ 4h 15min");
        timeChanger.addTime(time1, 4, 15);
        System.out.println(time1);

        System.out.println("+ 55min");
        timeChanger.addTime(time1, 0, 55);
        System.out.println(time1);

        System.out.println("+ 60sec");
        timeChanger.addTime(time1, 0, 0, 60);
        System.out.println(time1);

        System.out.println("+ 10h 10m 10sec");
        timeChanger.addTime(time1, 10, 10, 10);
        System.out.println(time1);

        System.out.println("set invalid time");
        timeChanger.setParticularTime (time1,112,122,122);
        System.out.println(time1);
    }
}
