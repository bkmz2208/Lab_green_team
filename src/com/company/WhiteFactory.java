package com.company;

public class WhiteFactory extends BaseFactory {  // WhiteFactory from BaseFactory
    @Override    // WhiteCircle (radius)

    Circle createCircle(int radius) {
        return new WhiteCircle(radius);
    }


    @Override   // WhiteTriangle ( (x1,y1); (x2,y2); (x3,y3) )
    Triangle createTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        return new WhiteTriangle(x1, y1, x2, y2, x3, y3);
    }
    // WhiteFactory
    @Override
    public String toString() {
        return "WhiteFactory";
    }
}
