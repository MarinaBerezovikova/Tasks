package com.company.agregationAndCoposition.Task2;

import static com.company.agregationAndCoposition.Task2.FuelTank.fuelCapacity;

public class CarDriver {

    private boolean driverInCar;

    public CarDriver(boolean driverInCar) {
        this.driverInCar = driverInCar;
    }

    public boolean getDriverInCar() {
        return this.driverInCar;
    }

    public void setDriverInCar(boolean driverInCar) {
        this.driverInCar = driverInCar;
    }

    //methods

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
            System.out.print("Car is staying already.");
        }
        if (!this.driverInCar) {
            System.out.println("The driver is not in the car.");
        }
    }

    public void refill(Car car, int liters) {
        int fuelAmount = car.getFuelTank().getFuelAmount();
        System.out.println("Car has " + fuelAmount + " litres in the tank.");
        int emptyAmount = fuelCapacity - fuelAmount;
        if (emptyAmount > liters) {
            fuelAmount += liters;
            System.out.println("Car has filled on " + liters + " litres. There are " + fuelAmount + " in the tank.");
        } else {
            int litresForRefill = (fuelCapacity - fuelAmount);
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
        if (numberOfWheel > WheelSet.ensureCountWheels) {
            System.out.println("This wheel is not exist.");
            return;
        }
        Wheel wheelNeedChange = car.getWheelSet().getWheelsArray().get(numberOfWheel);
        wheelNeedChange = new Wheel(wheelNeedChange.getWheel());

        car.getWheelSet().getWheelsArray().set(numberOfWheel, wheelNeedChange);
        System.out.println("The wheel has replaced.");

//        ArrayList<Wheel> wc = car.getWheelSet().getWheelsArray(); // for check in the debug

    }

    public static String sayACarModel(Car car) {
        return "It's a " + car.getModel() + ".";
    }
}
