package com.company;

import static java.lang.Math.abs;

public class WhiteTriangle extends Triangle {

    public WhiteTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public double areaCalculation() throws Exception {
        //verification: 3 points on the same line?
        if( (super.getX1()-super.getX2())*(super.getY3()-super.getY2()) == (super.getX3()-super.getX2())*(super.getY1()-super.getY2()) ){
            System.out.println("Triangle doesn`t exist! Points lie on the same line. ");
            throw new Exception();
        }
        else{
            System.out.println("Verification was successful. The triangle exist. ");
        }
        //calculation
        double s;
        s = abs(0.5 * (double) ( (super.getX1()-super.getX3())*(super.getY2()-super.getY3()) -
                (super.getY1()-super.getY3())*(super.getX2()-super.getX3()) ));
        return s;
    }

    @Override
    public String toString() {
        try {
            return "WhiteTriangle. Square = " + areaCalculation();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "White triangle has problems";
    }


}