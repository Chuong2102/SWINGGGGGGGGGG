/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7_AreaAndPerimeter;


/**
 *
 * @author nguye
 */
class Circle extends Shape{
    private double radius;
    private int x, y;

    public Circle() {
        
    }

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    
    @Override
    public double CalcPerimeter() {
        double result = 2 * Math.PI * this.radius;
        return result;
    }
    
    @Override
    public double CalcArea() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }
    
    @Override
    public String toString() {
        String output = "";
        output = "Dien tich hinh tron " + CalcArea() +
                    "\nChu vi hinh tron: " + CalcPerimeter();
        return output;
    }
    
    
    
   
}
