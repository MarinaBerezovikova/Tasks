package com.company.classes.Task6;

public class TimeChanger {

    public Time setParticularTime (Time time, int hour, int minute, int second) {
        time.setHour(hour);
        time.setMinute(minute);
        time.setSecond(second);
        return time;
    }

    public Time addTime(Time time, int newHour) {

        int hours = time.getHour();

        if (hours + newHour < Time.MAX_VALUE_HOURS) {
            time.setHour(hours + newHour);
        } else {
            hours = (hours + newHour) - Time.MAX_VALUE_HOURS;
            time.setHour(hours);
        }
        return time;
    }

    public Time addTime(Time time, int newHour, int newMinutes) {
        int hours = time.getHour();
        int minutes = time.getMinute();

        addTime(time, newHour);

        if (minutes + newMinutes < Time.MAX_VALUE_MINUTES) {
            time.setMinute(minutes + newMinutes);
        } else {
            minutes = (minutes + newMinutes) - Time.MAX_VALUE_MINUTES;
            time.setMinute(minutes);
            time.setHour(hours + 1);
        }
        return time;
    }

    public Time addTime(Time time, int newHour, int addMinutes, int addSeconds) {
        int hours = time.getHour();
        int minutes = time.getMinute();
        int seconds = time.getSecond();

        addTime(time, newHour);
        addTime(time, 0, addMinutes);

        if (seconds + addSeconds < Time.MAX_VALUE_SECONDS) {
            time.setSecond(seconds + addSeconds);
        } else {
            seconds = (seconds + addSeconds) - Time.MAX_VALUE_SECONDS;
            time.setSecond(seconds);
            time.setMinute(minutes + 1);
        }
        return time;
    }
}
// методы отнимания?
// нет ограничений по параметрам методов типо указать 999сек

