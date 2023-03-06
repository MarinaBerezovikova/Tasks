package com.company.agregationAndCoposition.Task3;

import java.util.*;

public class SquareCalculator {

    public void calculateDistrictSquare(District district) {

        List<City> list = new ArrayList<>(district.getCities());
        double resultSquare = 0.0;
        for (City city : list) {
            resultSquare += city.getCitySquare();
        }
        district.setDistrictSquare(resultSquare);
    }

    public void calculateRegionSquare(Region region) {
        List<District> list = new ArrayList<>(region.getDistricts());
        double resultSquare = 0.0;
        for (District district : list) {
            resultSquare += district.getDistrictSquare();
        }
        region.setRegionSquare(resultSquare);
    }

    public void calculateStateSquare(State state) {
        List<Region> list = new ArrayList<>(state.getRegions());
        double resultSquare = 0.0;
        for (Region region : list) {
            resultSquare += region.getRegionSquare();
        }
        state.setStateSquare(resultSquare);
    }
}
