package com.company.agregationAndCoposition.Task3;

import java.util.ArrayList;
import java.util.List;

public class Region { //область
    private String name;
    private City regionCenter;
    private List<District> districts = new ArrayList<>();
    private double regionSquare;

    public Region (String name, City regionCenter) {
        this.name = name;
        this. regionCenter = regionCenter;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public double getRegionSquare() {
        return regionSquare;
    }

    public void setRegionSquare(double regionSquare) {
        this.regionSquare = regionSquare;
    }
}
