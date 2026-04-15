package com.example.geometry.core;

public interface Shape {
    String getName();

    double area();

    double perimeter();

    default String describe() {
        return String.format(
                "%s -> area: %.2f, perimeter: %.2f",
                getName(),
                area(),
                perimeter()
        );
    }
}

