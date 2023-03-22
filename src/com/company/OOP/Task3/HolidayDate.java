package com.company.OOP.Task3;

import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

import static com.company.OOP.Task3.HolidayCalendar.HOLIDAY_DATES_MAP;

public class HolidayDate {
    private MonthDay date;
    private String holidayName;
    private boolean isDayOff = false;

    private HolidayDate() {
    }

    public static class Builder {
        private final HolidayDate newDate;

        public Builder() {
            newDate = new HolidayDate();
        }

        public Builder withDate(Month month, int day) {
            newDate.date = MonthDay.of(month, day);
            return this;
        }

        public Builder withHolidayCause(String holidayName) {
            newDate.holidayName = holidayName;
            return this;
        }

        public Builder withDayOff() {
            newDate.isDayOff = true;
            return this;
        }

        public HolidayDate build() {
            AddHolidayToList();
            return newDate;
        }

        private void AddHolidayToList() {

            Month monthOfNewHoliday = newDate.date.getMonth();
            HOLIDAY_DATES_MAP.get(monthOfNewHoliday).add(newDate);
            HOLIDAY_DATES_MAP.get(monthOfNewHoliday).sort(COMPARE_BY_DATA);
        }

        static private void sortHolidaysDates(ArrayList<HolidayDate> holidayDates) {
            holidayDates.sort(COMPARE_BY_DATA);
        }
    }

    private static final Comparator<HolidayDate> COMPARE_BY_DATA =
            Comparator.comparingInt(o -> o.date.getDayOfMonth());

    @Override
    public String toString() {
        if (isDayOff) {
            return "\nДата: " + date.format(DateTimeFormatter.ofPattern("d MMMM")) +
                    "\nПраздник: " + holidayName +
                    "\nВыходной";
        } else {
            return "\nДата: " + date.format(DateTimeFormatter.ofPattern("d MMMM")) +
                    "\nПраздник: " + holidayName +
                    "\nРабочий день";
        }
    }
}