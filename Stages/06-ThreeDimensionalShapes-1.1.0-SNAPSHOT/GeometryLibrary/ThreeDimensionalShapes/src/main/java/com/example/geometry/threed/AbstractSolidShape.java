package com.example.geometry.threed;

abstract class AbstractSolidShape {
    protected static void requirePositive(double value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " must be greater than zero.");
        }
    }
}

