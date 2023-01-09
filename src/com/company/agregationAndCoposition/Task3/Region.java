package com.company.agregationAndCoposition.Task3;

import java.util.ArrayList;
import java.util.List;

public class Region extends Area {

    private City regionCenter;
    private List<District> districts = new ArrayList<>();

    public Region(String name, City regionCenter) {
        super(name);
        this.regionCenter = regionCenter;
    }

    public City getRegionCenter() {
        return regionCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    public double getRegionSquare() {
        return super.square;
    }

    public void setRegionSquare(double regionSquare) {
        this.square = regionSquare;
    }
}
