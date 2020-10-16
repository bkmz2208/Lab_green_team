/* to calculate the area of a circle.
 */

package com.company;

public abstract class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(double radius){
        this.radius = radius;
    }

    public String toString(){
        return "I`m Circle";
    }

    public abstract double areaCalculation();

}