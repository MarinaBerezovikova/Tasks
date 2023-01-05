package com.company.agregationAndCoposition.Task3;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String name;
    private List <City> cities = new ArrayList<>();
    private double districtSquare;

    public District(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getDistrictSquare() {
        return districtSquare;
    }

    public void setDistrictSquare(double districtSquare) {
        this.districtSquare = districtSquare;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
