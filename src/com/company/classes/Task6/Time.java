package com.company.classes.Task6;

public class Time {

    public static final int MAX_VALUE_HOURS = 24;
    public static final int MAX_VALUE_MINUTES = 60;
    public static final int MAX_VALUE_SECONDS = 60;

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {

        this.hour = (hour < MAX_VALUE_HOURS) ? hour : 0;
        this.minute = (minute < MAX_VALUE_MINUTES) ? minute : 0;
        this.second = (second < MAX_VALUE_SECONDS) ? second : 0;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= MAX_VALUE_HOURS) {
            hour = 0;
        }
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= MAX_VALUE_MINUTES) {
            minute = 0;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= MAX_VALUE_SECONDS) {
            second = 0;
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return this.hour + " hours " + this.minute + " minutes " + this.second + " second ";
    }
}
