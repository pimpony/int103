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
public class GeometricComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape a, Shape b) {
        double area1 = a.getArea();
        double area2 = b.getArea();
        if (area1 < area2) {
            return -1;
        } else if (area1 == area2) {
            return 0;
        } else {
            return 1;
        }
    }

}
