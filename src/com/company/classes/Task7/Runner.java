package com.company.classes.Task7;

public class Runner {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(6.0, 7.0, 4.2); //a,b,c sides

        System.out.println("Is beginning state" + triangle);

        System.out.println("We added the coordinates of triangle.\n");

        triangle.setCoordinate1(-4.0, 3.0);
        triangle.setCoordinate2(-6.0, -5.0);
        triangle.setCoordinate3(7.0, -1.0);

        TriangleCalculator triangleCalculator = new TriangleCalculator(triangle);

        double perimeter = triangleCalculator.getPerimeter();
        System.out.println("Got a perimeter of triangle: " + perimeter);

        double area = triangleCalculator.getArea();
        System.out.println("Got a area of triangle: " + area);

        Coordinate pointOfMedianIntersection = triangleCalculator.getPointOfMedianIntersection();
        System.out.println("The point of intersection median has those address: " + pointOfMedianIntersection);
    }
}