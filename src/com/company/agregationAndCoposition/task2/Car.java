package com.company.agregationAndCoposition.task2;

public class Car  {

    private WheelSet wheelSet;
    private String model;
    private boolean isMoving = false;
    private Engine engine = new Engine();
    private FuelTank fuelTank;

    public Car(String model) {
        this.model = model;
        this.engine.setEngineInCar(true);
        this.wheelSet = new WheelSet();
        this.fuelTank = new FuelTank(0);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean getIsMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public WheelSet getWheelSet() {
        return wheelSet;
    }

    public void setWheelSet(WheelSet wheelSet) {
        this.wheelSet = wheelSet;
    }

    public FuelTank getFuelTank () {
        return this.fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }
}
