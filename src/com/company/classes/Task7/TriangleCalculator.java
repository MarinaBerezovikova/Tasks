package com.company.classes.Task7;

public class TriangleCalculator {

    private final Triangle triangle;

    public TriangleCalculator (Triangle triangle) {
        this.triangle = triangle;
    }

    public double getPerimeter() {
        double sideLength1 = triangle.getFirstSideLength();
        double sideLength2 = triangle.getSecondSideLength();
        double sideLength3 = triangle.getThirdSideLength();

        return sideLength1 + sideLength2 + sideLength3;
    }

    public double getArea() { // Heron's formula
        double sideLength1 = triangle.getFirstSideLength();
        double sideLength2 = triangle.getSecondSideLength();
        double sideLength3 = triangle.getThirdSideLength();
        double semiP = (sideLength1 + sideLength2 + sideLength3) / 2.0;
        return Math.sqrt(semiP * (semiP - sideLength1) * (semiP - sideLength2) * (semiP - sideLength3));
    }

    public Coordinate getPointOfMedianIntersection() {

        // check for null coordinates?
        Coordinate pointOfIntersection = new Coordinate();
        double x = (triangle.coordinateA.getX() + triangle.coordinateB.getX() + triangle.coordinateC.getX()) / 3.0;
        double y = (triangle.coordinateA.getY() + triangle.coordinateB.getY() + triangle.coordinateC.getY()) / 3.0;

        pointOfIntersection.setX(x);
        pointOfIntersection.setY(y);

        return pointOfIntersection;
    }
}

