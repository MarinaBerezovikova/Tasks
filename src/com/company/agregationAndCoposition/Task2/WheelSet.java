package com.company.agregationAndCoposition.Task2;

import java.util.ArrayList;

public class WheelSet extends Wheel {

    final public static int ensureCountWheels = 4;
    private final ArrayList<Wheel> wheelsArray = new ArrayList<>(ensureCountWheels);


    public WheelSet() {
        for (int i = ensureCountWheels; i > 0; i--) {
            wheelsArray.add(new Wheel());
        }
    }

    public ArrayList<Wheel> getWheelsArray() {
        return wheelsArray;
    }
}
