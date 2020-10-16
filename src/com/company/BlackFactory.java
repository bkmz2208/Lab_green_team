package com.company;

public class BlackFactory extends BaseFactory { // WhiteFactory from BaseFactory

    @Override
    //create a black circle(radius)
    public Circle createCircle(int radius) {
        return new BlackCircle(radius);
    }

    @Override
    //create a white triangle (x1,y1); (x2,y2); (x3,y3)
    public Triangle createTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        return new BlackTriangle(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public String toString() {
        return "BlackFactory";
    }

}
