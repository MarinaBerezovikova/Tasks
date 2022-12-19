package com.company.classes.Task5;

public class Counter {

    public static final int DEFAULT_MIN_COUNTER_VALUE = 0;
    public static final int DEFAULT_MAX_COUNTER_VALUE = 10;

    private final int min;
    private final int max;
    private int current;

    public Counter() { // by default
        min = DEFAULT_MIN_COUNTER_VALUE;
        max = DEFAULT_MAX_COUNTER_VALUE;
        current = DEFAULT_MIN_COUNTER_VALUE;
    }

    public Counter(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
