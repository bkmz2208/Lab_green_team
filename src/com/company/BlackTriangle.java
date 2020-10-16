package com.company;

public class BlackTriangle extends Triangle {

    public BlackTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public float areaCalculation() throws Exception {
        //verification: 3 points on the same line?
        if( (x1-x2)*(y3-y2) == (x3-x2)*(y1-y2) ){
            System.out.println("Triangle doesn`t exist! Points lie on the same line. ");
            throw new Exception();
        }
        else{
            System.out.println("Verification was successful. The triangle exist. ");
        }
        //calculation
        float s;
        s = 1/2 * ( (x1-x3)*(y2-y3) - (y1-y3)*(x2-x3) );
        return s;
    }

    @Override
    public String toString() {
        try {
            return "BlackTriangle.Area = " + areaCalculation();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Black triangle has problems";
    }
}





