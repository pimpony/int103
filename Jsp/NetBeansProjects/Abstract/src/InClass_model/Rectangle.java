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
public class Rectangle extends Shape{
 
    double width,height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
    
    

    public double getArea() {
        return this.width*this.height;
    }


    public double getParameter() {
       return 2*(this.width+this.height);
    }
    
}
