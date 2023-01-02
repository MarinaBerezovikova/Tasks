package com.company.agregationAndCoposition.Task2;

import java.util.ArrayList;

public class CarDriver {

    private boolean driverInCar = false;

    public CarDriver() {
    }

    public boolean getDriverInCar() {
        return this.driverInCar;
    }

    public void setDriverInCar(boolean driverInCar) {
        this.driverInCar = driverInCar;
    }

    public void move(Car car) {
        if (car.getIsMoving()) {
            System.out.println("Car is moving already. ");
        } else if (this.driverInCar) {
            car.getEngine().setEngineOn(true);
            car.setMoving(true);
            System.out.println("Car has move. ");
        } else {
            System.out.println("Car can't move without driver.");
        }
    }

    public void stop(Car car) {
        if (car.getIsMoving()) {
            car.getEngine().setEngineOn(false);
            car.setMoving(false);
            System.out.println("Car has stopped. ");
        } else {
            System.out.println("Car is staying already.");
        }
    }

    public void refill(Car car, int liters) {
        int fuelAmount = car.getFuelTank().getFuelAmount();
        System.out.println("Car has " + fuelAmount + " litres in the tank.");
        int availableForRefueling = FuelTank.fuelCapacity - fuelAmount;

        if (availableForRefueling >= liters) {
            fuelAmount += liters;
            System.out.println("Car has filled on " + liters + " litres. There are " + fuelAmount + " in the tank.");
        } else {
            fuelAmount += availableForRefueling;
            System.out.println("The tank is full. Car has filled on " + availableForRefueling + " litres.");
        }
        car.getFuelTank().setFuelAmount(fuelAmount);
    }

    public void wheelReplace(Car car, int numberOfWheel) {
        if (car.getIsMoving()) {
            System.out.println("Because of car is moving, we can't replace the wheel.");
            return;
        }
        if (numberOfWheel > WheelSet.ENSURE_COUNT_WHEELS || numberOfWheel < 0) {
            System.out.println("This wheel is not exist.");
            return;
        }
        ArrayList<Wheel> wheels = new ArrayList<>(car.getWheelSet().getWheelsArray());
        int currentWheelState = wheels.get(numberOfWheel).getWheelState() + 1;

        Wheel newWheel = new Wheel();
        newWheel.setWheelState(currentWheelState);

        car.getWheelSet().getWheelsArray().set(numberOfWheel, newWheel);

        System.out.println("The wheel has replaced.");

        //show the wheel's state
        wheels = car.getWheelSet().getWheelsArray();
        for (Wheel wheel1 : wheels) {
            System.out.println(wheel1.getWheelState());
        }
    }

    public static String sayACarModel(Car car) {
        return "It's a " + car.getModel() + ".";
    }
}
