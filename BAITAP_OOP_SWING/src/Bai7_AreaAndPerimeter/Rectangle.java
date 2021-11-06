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
class Rectangle extends Shape {
    private int upper_x;    
    private int upper_y;
    private int lower_x;
    private int lower_y;

    public Rectangle() {
    }

    public Rectangle(int upper_x, int upper_y, int lower_x, int lower_y) {
        this.upper_x = upper_x;
        this.upper_y = upper_y;
        this.lower_x = lower_x;
        this.lower_y = lower_y;
    }
    
    @Override
    public double CalcPerimeter() {
        double result = ((Math.abs(upper_x - upper_y) + Math.abs(lower_x - lower_y))) * 2;
        return result;
    }
    
    @Override
    public double CalcArea() {
        double result = (Math.abs(upper_x - upper_y) * Math.abs(lower_x - lower_y));
        return result;
    }

    @Override
    public String toString() {
        String output = "";
        output = "Dien tich hinh chu nhat: " + CalcArea() +
                    "\nChu vi hinh chu nhat: " + CalcPerimeter();
        return output;
    }
    
    
}
