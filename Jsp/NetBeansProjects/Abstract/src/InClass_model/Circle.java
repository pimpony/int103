/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClass_model;

import static java.lang.Math.PI;

/**
 *
 * @author Live-
 */
public class Circle extends  Shape{

    private double redius;

    public Circle(  double redius ,String color) {
        super(color);
        this.redius = redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
    
  public  double getDaimeter(){
      return 2*this.redius;
    }
    
   
    public double getArea() {
         return Math.PI *this.redius* this.redius ;
    }

 
    public double getParameter() {
     return 2*Math.PI *this.redius ;
    }
    
   
    
   
    
    
    
    
    
}
