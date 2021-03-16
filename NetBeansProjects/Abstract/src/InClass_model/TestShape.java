/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClass_model;

/**
 *
 * @author Live-
 */
public class TestShape {

    public static void main(String[] args) {

        Circle cl1 = new Circle(5, "blue");
        Circle cl2 = new Circle(3, "blue");
        Shape sl2 = new Circle(5, "blue");
        Shape sl3 = new Rectangle(5, 5, "red");

        cl1.getArea();
        sl2.getArea();
        sl3.getArea();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(50, "red");
        shapes[1] = new Circle(50, "red");
        shapes[2] = new Rectangle(50,30, "red");

        

        System.out.println(cl1.getArea());
        System.out.println(sl2.getArea());
        System.out.println(sl3.getArea());
        System.out.println(compareArea(cl2, sl2));

    }

    public static int compareArea(Shape s1, Shape s2) {
        return (int) (s1.getArea() - s2.getArea());
    }

}
