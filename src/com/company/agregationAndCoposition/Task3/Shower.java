package com.company.agregationAndCoposition.Task3;

public class Shower {

    State state;
    public Shower (State state){
        this.state = state;
    }

    public void showCapitalState() {
        String capital = this.state.getCapital().getName();
        String stateName = this.state.getName();
        System.out.println("The capital of " + stateName + " is " + capital + "." );
    }
    public void showCountRegions () {
        int countRegions = state.getRegions().size();
        System.out.println("The state has " + countRegions + " regions." );
    }
    public void showRegionsCentres () {
        System.out.println("The list of centres of regions: ");
        for (Region region: state.getRegions()) {
            System.out.println(region.getRegionCenter().getName());
        }
    }
    public void showStateSquare() {
        System.out.println("The common square of state is : "+ state.getStateSquare());
    }
}
