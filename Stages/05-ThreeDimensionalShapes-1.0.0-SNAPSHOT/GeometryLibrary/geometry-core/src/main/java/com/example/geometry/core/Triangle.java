package com.example.geometry.core;

public class Triangle extends AbstractShape implements Shape {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        requirePositive(sideA, "Side A");
        requirePositive(sideB, "Side B");
        requirePositive(sideC, "Side C");
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("The provided sides do not form a valid triangle.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double area() {
        double semiPerimeter = perimeter() / 2;
        return Math.sqrt(
                semiPerimeter
                        * (semiPerimeter - sideA)
                        * (semiPerimeter - sideB)
                        * (semiPerimeter - sideC)
        );
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

