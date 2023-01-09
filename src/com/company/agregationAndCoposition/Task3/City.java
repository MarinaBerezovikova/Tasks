package com.company.agregationAndCoposition.Task3;

public class City extends Area {

    public City(String name, double citySquare) {
        super(name, citySquare);
    }

    public String getName() {
        return super.name;
    }

    public double getCitySquare() {
        return super.square;
    }
}
