package com.example.geometry.app;

import com.example.geometry.core.Circle;
import com.example.geometry.core.Rectangle;
import com.example.geometry.core.Shape;
import com.example.geometry.core.Triangle;

import java.util.List;

public class GeometryApplication {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 4, 5)
        );

        System.out.println("Two-dimensional shapes");
        for (Shape shape : shapes) {
            System.out.println(shape.describe());
        }
    }
}

