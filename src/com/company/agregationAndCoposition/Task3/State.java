package com.company.agregationAndCoposition.Task3;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private City capital;
    private List<Region> regions = new ArrayList<>();
    private double stateSquare;

    public State(String name, City capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
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
