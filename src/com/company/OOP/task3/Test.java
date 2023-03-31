package com.company.OOP.task3;

import java.time.Month;

public class Test {

    public static void main(String[] args) {

        HolidayCalendar.createNewHolidayCalendar();

        HolidayDate day1 = new HolidayDate.Builder()
                .withDate(Month.JANUARY, 1)
                .withHolidayCause("Новый год")
                .withDayOff()
                .build();
        HolidayCalendar.addHolidayToCalendar(day1);

        HolidayDate day2 = new HolidayDate.Builder()
                .withDate(Month.FEBRUARY, 10)
                .withHolidayCause("День рождения у Марины")
                .build();
        HolidayCalendar.addHolidayToCalendar(day2);

        HolidayDate day3 = new HolidayDate.Builder()
                .withDate(Month.JULY, 18)
                .withHolidayCause("День рождения у Вани")
                .build();
        HolidayCalendar.addHolidayToCalendar(day3);

        HolidayDate day4 = new HolidayDate.Builder()
                .withDate(Month.MAY, 1)
                .withHolidayCause("День труда")
                .withDayOff()
                .build();
        HolidayCalendar.addHolidayToCalendar(day4);

        HolidayDate day5 = new HolidayDate.Builder()
                .withDate(Month.MARCH, 15)
                .withHolidayCause("Всемирный день уважения")
                .build();
        HolidayCalendar.addHolidayToCalendar(day5);

        HolidayDate day6 = new HolidayDate.Builder()
                .withDate(Month.MARCH, 15)
                .withHolidayCause("День рождения эскалатора")
                .build();
        HolidayCalendar.addHolidayToCalendar(day6);

        HolidayDate day7 = new HolidayDate.Builder()
                .withDate(Month.MARCH, 8)
                .withHolidayCause("Международный женский день")
                .build();
        HolidayCalendar.addHolidayToCalendar(day7);

        HolidayDate day9 = new HolidayDate.Builder()
                .withDate(Month.MARCH, 20)
                .withHolidayCause("День весеннего равноденствия")
                .build();
        HolidayCalendar.addHolidayToCalendar(day9);

        HolidayDate day8 = new HolidayDate.Builder()
                .withDate(Month.JANUARY, 7)
                .withHolidayCause("Рождество")
                .withDayOff()
                .build();
        HolidayCalendar.addHolidayToCalendar(day8);

        Shower.showEntireCalendar();
        System.out.println("============");
        Shower.showByParticularMonth(Month.MARCH);
    }
}