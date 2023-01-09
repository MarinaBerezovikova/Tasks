package com.company.agregationAndCoposition.Task3;

public abstract class Area {
    // для масштабирования можно создавать новые классы - населенные пункты

    protected String name;
    protected double square;

    public Area (String name, double square)  {
        this.name = name;
        this.square = square;
    }

    public Area (String name)  {
        this.name = name;
    }

}

