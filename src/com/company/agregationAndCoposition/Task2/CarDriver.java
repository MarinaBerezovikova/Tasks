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
        } else if (!car.getIsMoving() & this.driverInCar) {
            car.getEngine().setEngineOn(true);
            car.setMoving(true);
            System.out.println("Car has move. ");
        } else {
            System.out.println("Car can't move without driver.");
        }
    }

    public void stop(Car car) {
        if (car.getIsMoving() & this.driverInCar) {
            car.getEngine().setEngineOn(false);
            car.setMoving(false);
            System.out.println("Car has stopped. ");
        } else {
            System.out.println("Car is staying already.");
        }
        if (!this.driverInCar) {
            System.out.println("The driver is not in the car.");
        }
    }

    public void refill(Car car, int liters) {
        int fuelAmount = car.getFuelTank().getFuelAmount();
        System.out.println("Car has " + fuelAmount + " litres in the tank.");
        int emptyAmount = FuelTank.fuelCapacity - fuelAmount;
        if (emptyAmount > liters) {
            fuelAmount += liters;
            System.out.println("Car has filled on " + liters + " litres. There are " + fuelAmount + " in the tank.");
        } else {
            int litresForRefill = (FuelTank.fuelCapacity - fuelAmount);
            fuelAmount += litresForRefill;
            System.out.println("The tank is full. Car has filled on " + litresForRefill + " litres.");
        }
        car.getFuelTank().setFuelAmount(fuelAmount);
    }

    public void wheelReplace(Car car, int numberOfWheel) {
        if (car.getIsMoving()) {
            System.out.println("Because of car is moving, we can't replace the wheel.");
            return;
        }
        if (numberOfWheel > WheelSet.ensureCountWheels || numberOfWheel < 0) {
            System.out.println("This wheel is not exist.");
            return;
        }
        Wheel newWheel = new Wheel();
        int newWheelState = car.getWheelSet().getWheelsArray().get(numberOfWheel).getWheelState() + 1;
        newWheel.setWheelState(newWheelState);

        car.getWheelSet().getWheelsArray().set(numberOfWheel, newWheel);

        System.out.println("The wheel has replaced.");

        //show the wheel's state
        ArrayList<Wheel> wheels = car.getWheelSet().getWheelsArray();
        for (Wheel wheel1 : wheels) {
            System.out.println(wheel1.getWheelState());
        }
    }

    public static String sayACarModel(Car car) {
        return "It's a " + car.getModel() + ".";
    }
}
