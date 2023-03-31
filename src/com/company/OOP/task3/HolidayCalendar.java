package com.company.OOP.task3;

import java.time.Month;
import java.util.*;

public class HolidayCalendar {

    public static Map<Month, List<HolidayDate>> HOLIDAY_DATES_MAP = new TreeMap<>();

    public static void createNewHolidayCalendar() {
        fillHolidayCalendarWithMonth();
    }

    private static void fillHolidayCalendarWithMonth () {
        for (Month month : Month.values()) {
            HOLIDAY_DATES_MAP.put(month, new ArrayList<>());
        }
    }

    private static final Comparator<HolidayDate> COMPARE_BY_DATA =
            Comparator.comparingInt(HolidayDate::getDateFromHD);

    public static void addHolidayToCalendar(HolidayDate holidayDate) {
        Month monthOfNewHoliday = holidayDate.getMonthFromHD();
        HOLIDAY_DATES_MAP.get(monthOfNewHoliday).add(holidayDate);
        HOLIDAY_DATES_MAP.get(monthOfNewHoliday).sort(COMPARE_BY_DATA);
    }
}