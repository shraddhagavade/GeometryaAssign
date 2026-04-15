package com.example.geometry.threed;

public class Sphere extends AbstractSolidShape implements SolidShape {
    private final double radius;

    public Sphere(double radius) {
        requirePositive(radius, "Radius");
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Sphere";
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

