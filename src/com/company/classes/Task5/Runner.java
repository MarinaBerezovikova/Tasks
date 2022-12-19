package com.company.classes.Task5;

public class Runner {
    public static void main(String[] args) {

        Counter counter = new Counter(-10,10,0);

        StatePrinter statePrinter = new StatePrinter();

        //A current count of counter
        statePrinter.getCurrentState(counter);

        StateChanger stateChanger = new StateChanger();
        //increase
        System.out.println("Increase: ");
        stateChanger.increaseCount(counter);
        statePrinter.getCurrentState(counter);

        //decrease
        System.out.println("Decrease: ");
        stateChanger.decreaseCount(counter);
        statePrinter.getCurrentState(counter);

        System.out.println("increase more than one element: ");
        for (int i = 0; i < 15; i++) {
            stateChanger.increaseCount(counter);
            statePrinter.getCurrentState(counter);
        }

        System.out.println("decrease more than one element: ");
        for (int i = 0; i < 30; i++) {
            stateChanger.decreaseCount(counter);
            statePrinter.getCurrentState(counter);
        }
    }
}