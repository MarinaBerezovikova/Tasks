package com.company.classes.Task7;

class Triangle {

    private final double firstSideLength;
    private final double secondSideLength;
    private final double thirdSideLength;

    Coordinate coordinateA = new Coordinate();
    Coordinate coordinateB = new Coordinate();
    Coordinate coordinateC = new Coordinate();

    public Triangle() { //by default

        firstSideLength = 10.0;
        secondSideLength = firstSideLength;
        thirdSideLength = firstSideLength;
    }

    //we specify every element besides Coordinate
    public Triangle(double firstSide, double secondSide, double thirdSide) {

        firstSideLength = firstSide;
        secondSideLength = secondSide;
        thirdSideLength = thirdSide;
    }

    //we specify every element
    public Triangle(double firstSide, double secondSide, double thirdSide, int xA, int yA, int xB, int yB, int xC, int yC) {

        firstSideLength = firstSide;
        secondSideLength = secondSide;
        thirdSideLength = thirdSide;

        this.coordinateA = new Coordinate(xA, yA);
        this.coordinateB = new Coordinate(xB, yB);
        this.coordinateC = new Coordinate(xC, yC);
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    public double getThirdSideLength() {
        return thirdSideLength;
    }

    public Coordinate getCoordinateA() {
        return coordinateA;
    }

    public Coordinate getCoordinateB() {
        return coordinateB;
    }

    public Coordinate getCoordinateC() {
        return coordinateC;
    }

    public void setCoordinate1(double x, double y) {
        coordinateA.setX(x);
        coordinateA.setY(y);
    }

    public void setCoordinate2(double x, double y) {
        coordinateB.setX(x);
        coordinateB.setY(y);
    }

    public void setCoordinate3(double x, double y) {
        coordinateC.setX(x);
        coordinateC.setY(y);
    }

    @Override
    public String toString() {
        return "Side a = " + firstSideLength + ", side b = " + secondSideLength + ", side c = " + thirdSideLength + "\n---------\n";
    }
}
