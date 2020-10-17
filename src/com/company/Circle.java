/* to calculate the area of a circle.
 */

package com.company;

public abstract class Circle {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    Circle(int radius){
        this.radius = radius;
    }

    public String toString(){
        return "I`m Circle";
    }

    public abstract double areaCalculation();

}