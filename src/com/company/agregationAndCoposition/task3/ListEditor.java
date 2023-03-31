package com.company.agregationAndCoposition.task3;

import java.util.ArrayList;
import java.util.List;

public class ListEditor {

    public void addToList(City city, District district) {
        List<City> list = new ArrayList<>(district.getCities());
        list.add(city);
        district.setCities(list);
    }

    public void addToList(District district, Region region) {
        List<District> list = new ArrayList<>(region.getDistricts());
        list.add(district);
        region.setDistricts(list);
    }

    public void addToList(Region region, State state) {
        List<Region> list = new ArrayList<>(state.getRegions());
        list.add(region);
        state.setRegions(list);
    }
}