package com.example.geometry.threed;

public class Cube extends AbstractSolidShape implements SolidShape {
    private final double side;

    public Cube(double side) {
        requirePositive(side, "Side");
        this.side = side;
    }

    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

