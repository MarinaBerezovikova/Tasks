package com.company.agregationAndCoposition.Task3;

public class City {
    private String name;
    private double citySquare;

    public City(String name, double citySquare) {
        this.name = name;
        this.citySquare = citySquare;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCitySquare() {
        return citySquare;
    }

    public void setCitySquare(double citySquare) {
        this.citySquare = citySquare;
    }
}
