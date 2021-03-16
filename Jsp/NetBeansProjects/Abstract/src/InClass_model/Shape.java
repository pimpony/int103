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
public abstract class Shape {

    private String color, type;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getParameter();

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + '}';
    }

  
}
