package com.company;

public class WhiteCircle extends Circle {
    public WhiteCircle(int radius){
        super(radius);
    }
    @Override
    public String ToSting(){
        return "WhiteCircle";
    }
    @Override
    public double areaOfCircle(){
        return Math.PI*Math.pow(radius,2);
    }
}
