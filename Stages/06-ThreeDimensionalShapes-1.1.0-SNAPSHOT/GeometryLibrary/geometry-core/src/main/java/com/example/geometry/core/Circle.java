package com.example.geometry.core;

public class Circle extends AbstractShape implements Shape {
    private final double radius;

    public Circle(double radius) {
        requirePositive(radius, "Radius");
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

