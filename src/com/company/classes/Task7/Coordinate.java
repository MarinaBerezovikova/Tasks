package com.company.classes.Task7;

class Coordinate {
    private double x;
    private double y;

    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "X = " + getX() + ", Y = " + getY();
    }
}
