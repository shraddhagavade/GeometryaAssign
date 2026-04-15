package com.example.geometry.core;

public class Rectangle extends AbstractShape implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        requirePositive(width, "Width");
        requirePositive(height, "Height");
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}

