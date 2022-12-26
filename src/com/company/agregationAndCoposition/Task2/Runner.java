package com.company.agregationAndCoposition.Task2;

public class Runner {

    public static void main(String[] args) {

        CarDriver carDriver = new CarDriver(false);
        Car car = new Car("Skoda");

        System.out.println("We has create a car. " + CarDriver.sayACarModel(car) + " Let's try to stop it.");
        carDriver.stop(car);

        carDriver.setDriverInCar(true);

        System.out.println("We need to fill the car.");
        carDriver.refill(car, 30);

        System.out.println("We need to fill the car.");
        carDriver.refill(car, 50);

        System.out.println("Driver has sit in te car.");
        carDriver.move(car);

        System.out.println("Let's check the car. Is it still moving?" + " It's " + car.getIsMoving());

        System.out.println("We need a pit stop. The wheel of car was broken.");

        carDriver.wheelReplace(car, 2);

        System.out.println("We forgot to stop the car. Will do it and tre again.");

        carDriver.stop(car);
        carDriver.wheelReplace(car, 2);
    }
}
