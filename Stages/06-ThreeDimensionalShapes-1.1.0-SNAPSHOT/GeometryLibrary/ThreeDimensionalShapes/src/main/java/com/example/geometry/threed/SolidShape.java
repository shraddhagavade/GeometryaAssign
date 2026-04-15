package com.example.geometry.threed;

public interface SolidShape {
    String getName();

    double surfaceArea();

    double volume();

    default String describe() {
        return String.format(
                "%s -> surface area: %.2f, volume: %.2f",
                getName(),
                surfaceArea(),
                volume()
        );
    }
}

