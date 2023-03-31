package com.company.agregationAndCoposition.task3;

import java.util.ArrayList;
import java.util.List;

public class District extends Area {

    private List<City> cities = new ArrayList<>();

    public District(String name) {
        super(name);
    }

    public double getDistrictSquare() {
        return super.square;
    }

    public void setDistrictSquare(double districtSquare) {
        square = districtSquare;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
