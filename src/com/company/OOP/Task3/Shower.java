package com.company.OOP.Task3;

import java.time.Month;


import static com.company.OOP.Task3.HolidayCalendar.HOLIDAY_DATES_MAP;

public class Shower {

    static public void ShowEntireCalendar() {
        HOLIDAY_DATES_MAP.forEach((key, currentList) -> currentList.forEach(System.out::println));
    }

    static public void ShowByParticularMonth(Month month) {
        System.out.println(month + " праздники:");
        HOLIDAY_DATES_MAP.get(month).forEach(System.out::println);
    }
}