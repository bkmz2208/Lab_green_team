package com.company;

public class BlackTriangle extends Triangle {

    public BlackTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public float areaCalculation() throws Exception {
        return super.areaCalculation();
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





