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


    public double areaCalculation() {
        double s;
        s = Math.PI * (radius * radius);
        return s;
    }

}