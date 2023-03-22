package com.company.OOP.Task3;

import java.time.Month;

public class Test {

    public static void main(String[] args) {

        HolidayCalendar.createNewHolidayCalendar();

        HolidayDate day1 = new HolidayDate.Builder()
                .withDate(Month.JANUARY, 1)
                .withHolidayCause("Новый год")
                .withDayOff()
                .build();

        HolidayDate day2 = new HolidayDate.Builder()
                .withDate(Month.FEBRUARY, 10)
                .withHolidayCause("День рождения у Марины")
                .build();

        HolidayDate day3 = new HolidayDate.Builder()
                .withDate(Month.JULY, 18)
                .withHolidayCause("День рождения у Вани")
                .build();

        HolidayDate day4 = new HolidayDate.Builder()
                .withDate(Month.MAY, 1)
                .withHolidayCause("День труда")
                .withDayOff()
                .build();

        HolidayDate day5 = new HolidayDate.Builder()
                .withDate(Month.MARCH, 15)
                .withHolidayCause("Всемирный день уважения")
                .build();

        HolidayDate day6 = new HolidayDate.Builder()
                .withDate(Month.MARCH, 15)
                .withHolidayCause("День рождения эскалатора")
                .build();

        HolidayDate day7 = new HolidayDate.Builder()
                .withDate(Month.MARCH, 8)
                .withHolidayCause("Международный женский день")
                .build();

        HolidayDate day9 = new HolidayDate.Builder()
                .withDate(Month.MARCH, 20)
                .withHolidayCause("День весеннего равноденствия")
                .build();

        HolidayDate day8 = new HolidayDate.Builder()
                .withDate(Month.JANUARY, 7)
                .withHolidayCause("Рождество")
                .withDayOff()
                .build();

        Shower.ShowEntireCalendar();
        System.out.println("============");
        Shower.ShowByParticularMonth(Month.MARCH);

    }
}