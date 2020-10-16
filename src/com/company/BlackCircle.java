package com.company;

public class BlackCircle extends Circle {
    public BlackCircle(int radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "BlackCircle";
    }

    @Override
    public double areaCalculation() {
        return  Math.PI* Math.pow(super.getRadius(),2);
    }
}