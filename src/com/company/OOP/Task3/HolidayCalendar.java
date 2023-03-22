package com.company.OOP.Task3;

import java.time.Month;
import java.util.*;

public class HolidayCalendar {

    public static Map<Month, List<HolidayDate>> HOLIDAY_DATES_MAP = new TreeMap<>();

    public static void createNewHolidayCalendar() {
        for (Month month : Month.values()) {
            HOLIDAY_DATES_MAP.put(month, new ArrayList<>());
        }
    }
}