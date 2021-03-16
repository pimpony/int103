/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparator.Shape;

import java.util.Comparator;

/**
 *
 * @author Live-
 */
public class TestGeometricComparator {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 5);
        Shape circle = new Circle(5);
        Shape g = max(rectangle, circle, new GeometricComparator());
        System.out.println("The area of the larger object is " + g.getArea());
    }

    public static Shape max(Shape g1, Shape g2, Comparator<Shape> c) {
        if (c.compare(g1, g2) > 0) {
            return g1;
        } else {
            return g2;
        }
    }
}
