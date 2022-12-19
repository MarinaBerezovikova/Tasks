package com.company.agregationAndCoposition.Task2;

public class Wheel {

    private int wheel = 0;

    // const default

    public Wheel() {
    }

    public Wheel(int newWheel) {
        this.wheel += 1;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
