package com.company.OOP.task3;

import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class HolidayDate {

    private MonthDay date;
    private String holidayName;
    private boolean isDayOff = false;

    private HolidayDate() {
    }

    public Month getMonthFromHD() {
        return date.getMonth();
    }

    public int getDateFromHD() {
        return date.getDayOfMonth();
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
            return newDate;
        }
    }

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