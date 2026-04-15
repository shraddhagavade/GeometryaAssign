package com.example.geometry.app;

import com.example.geometry.core.Circle;
import com.example.geometry.core.Rectangle;
import com.example.geometry.core.Shape;
import com.example.geometry.core.Triangle;
import com.example.geometry.threed.Cube;
import com.example.geometry.threed.SolidShape;
import com.example.geometry.threed.Sphere;
import com.example.geometry.utils.GeometryUtils;

import java.util.List;

public class GeometryApplication {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5)
        );

        List<SolidShape> solidShapes = List.of(
                new Cube(3),
                new Sphere(2.5)
        );

        System.out.println("Two-dimensional shapes");
        for (Shape shape : shapes) {
            System.out.println(shape.describe());
        }

        System.out.println();
        System.out.println("Utility operations");
        System.out.printf("12.70 cm in inches: %.2f%n", GeometryUtils.centimetersToInches(12.70));
        System.out.println(GeometryUtils.formatShapeComparison(shapes.get(0), shapes.get(1)));
        System.out.printf("Perimeter comparison result (circle vs rectangle): %d%n", GeometryUtils.compareByPerimeter(shapes.get(0), shapes.get(1)));

        System.out.println();
        System.out.println("Three-dimensional shapes");
        for (SolidShape solidShape : solidShapes) {
            System.out.println(solidShape.describe());
        }
    }
}

