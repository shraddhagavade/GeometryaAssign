package com.example.geometry.utils;

import com.example.geometry.core.Shape;

public final class GeometryUtils {
    private static final double CENTIMETERS_PER_INCH = 2.54;

    private GeometryUtils() {
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / CENTIMETERS_PER_INCH;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * CENTIMETERS_PER_INCH;
    }

    public static int compareByArea(Shape first, Shape second) {
        return Double.compare(first.area(), second.area());
    }
}

