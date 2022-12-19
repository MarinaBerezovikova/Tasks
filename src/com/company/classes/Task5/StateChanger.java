package com.company.classes.Task5;

public class StateChanger {

    public Counter increaseCount(Counter counter) {
        int counterElement = counter.getCurrent() + 1;
        if (counterElement > counter.getMax()) {
            counter.setCurrent(counter.getMin());
        } else {
            counter.setCurrent(counterElement);
        }
        return counter;
    }

    public Counter decreaseCount(Counter counter) {
        int counterElement = counter.getCurrent() - 1;
        if (counterElement < counter.getMin()) {
            counter.setCurrent(counter.getMax());
        } else {
            counter.setCurrent(counterElement);
        }
        return counter;
    }
}