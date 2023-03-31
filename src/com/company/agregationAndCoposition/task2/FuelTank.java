package com.company.agregationAndCoposition.task2;

public class FuelTank {

    final public static int fuelCapacity = 70;
    private int fuelAmount;

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
