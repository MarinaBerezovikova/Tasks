package com.company.agregationAndCoposition.Task2;

public class Car  { // может быть правильнее сделать водителя интерфейсом?

    private WheelSet wheelSet;
    private String model;
    private boolean isMoving = false;
    private Engine engine = new Engine();

    // constructor
    public Car(String model) {
        this.model = model;
        this.engine.setEngineInCar(true);
        this.wheelSet = new WheelSet();
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
}
