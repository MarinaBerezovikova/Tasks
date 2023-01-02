package com.company.agregationAndCoposition.Task2;

import java.util.ArrayList;

public class WheelSet extends Wheel {

    final public static int ENSURE_COUNT_WHEELS = 4;
    private final ArrayList<Wheel> wheelsArray = new ArrayList<>(ENSURE_COUNT_WHEELS);


    public WheelSet() {
        for (int i = ENSURE_COUNT_WHEELS; i > 0; i--) {
            wheelsArray.add(new Wheel());
        }
    }

    public ArrayList<Wheel> getWheelsArray() {
        return wheelsArray;
    }
}
