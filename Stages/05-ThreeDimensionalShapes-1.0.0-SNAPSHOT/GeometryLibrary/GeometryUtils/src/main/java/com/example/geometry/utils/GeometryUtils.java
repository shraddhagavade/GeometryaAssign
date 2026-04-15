package com.example.geometry.utils;

import com.example.geometry.core.Shape;

public final class GeometryUtils {
    private static final double CENTIMETERS_PER_INCH = 2.54;
    private static final double EPSILON = 0.0001;

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

    public static int compareByPerimeter(Shape first, Shape second) {
        return Double.compare(first.perimeter(), second.perimeter());
    }

    public static boolean haveAlmostEqualArea(Shape first, Shape second) {
        return Math.abs(first.area() - second.area()) < EPSILON;
    }

    public static String formatShapeComparison(Shape first, Shape second) {
        int areaComparison = compareByArea(first, second);
        if (areaComparison == 0) {
            return first.getName() + " has the same area as " + second.getName() + ".";
        }
        if (areaComparison > 0) {
            return first.getName() + " has a larger area than " + second.getName() + ".";
        }
        return first.getName() + " has a smaller area than " + second.getName() + ".";
    }
}

