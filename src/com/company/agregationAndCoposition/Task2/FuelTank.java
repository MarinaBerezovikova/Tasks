package com.company.agregationAndCoposition.Task2;

public class FuelTank {

    public static final int fuelCapacity = 70;
    private int fuelAmount;

    public FuelTank () {
    }

    public FuelTank (int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int setFuelAmount(int litres) {
        this.fuelAmount += litres;
        return fuelAmount;
    }
}
