package com.company;

public class WhiteCircle extends Circle {
    public WhiteCircle(int radius){
        super(radius);
    }
    @Override
    public String toString(){
        return "WhiteCircle";
    }
    @Override
    public double areaCalculation(){
        return Math.PI*Math.pow(super.getRadius(),2);
    }
}

