package com.company.agregationAndCoposition.task2;

public class Engine {

    private boolean engineOn = false;
    private boolean engineInCar = false;

    public Engine() {
    }

    public boolean isEngineInCar() {
        return engineInCar;
    }

    public void setEngineInCar(boolean engineInCar) {
        this.engineInCar = engineInCar;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }
}
