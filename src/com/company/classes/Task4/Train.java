package com.company.classes.Task4;

import java.time.DateTimeException;
import java.time.LocalTime;

class Train {

    private int trainNumber;
    private String destination;
    private int hours;
    private int minutes;
    private LocalTime departureTime;

    public Train() {
        this.trainNumber = 0;
        this.destination = "Rundomland";
        this.departureTime = LocalTime.MIN;
    }

    public Train(final int trainNumber, final String destination, int hours, int minutes) {
        this();
        this.trainNumber = trainNumber;
        this.destination = destination;
        try {
            this.departureTime = LocalTime.of(hours, minutes); //  LocalTime depTime = LocalTime.of(hours, minutes)

        } catch (DateTimeException exception) {
            this.hours = 0;
            this.minutes = 0;
        }
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int hours, int minutes) { ///??? норм ли так
        this.departureTime = LocalTime.of(hours, minutes);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
