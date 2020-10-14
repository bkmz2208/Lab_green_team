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
    public double areaOfCircle() {
        return  Math.PI* Math.pow(radius,2);
    }
}
