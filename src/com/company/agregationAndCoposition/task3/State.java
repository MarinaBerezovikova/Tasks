package com.company.agregationAndCoposition.task3;

import java.util.ArrayList;
import java.util.List;

public class State extends Area {

    private City capital;
    private List<Region> regions = new ArrayList<>();
    private double stateSquare;

    public State(String name, City capital) {
        super(name);
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public City getCapital() {
        return capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public double getStateSquare() {
        return stateSquare;
    }

    public void setStateSquare(double stateSquare) {
        this.stateSquare = stateSquare;
    }
}
