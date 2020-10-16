package com.company;

public abstract class Triangle {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    public int getX2(){
        return x2;
    }
    public int getY2(){
        return y2;
    }
    public int getX3(){
        return x3;
    }
    public int getY3(){
        return y3;
    }

    public void setX1(){
        this.x1 = x1;
    }
    public void setY1(){
        this.y1 = y1;
    }
    public void setX2(){
        this.x2 = x2;
    }
    public void setY2(){
        this.y2 = y2;
    }
    public void setX3(){
        this.x3 = x3;
    }
    public void setY3(){
        this.y3 = y3;
    }

    Triangle(int X1, int Y1, int X2, int Y2, int X3, int Y3){
        x1 = X1;
        y1 = Y1;
        x2 = X2;
        y2 = Y2;
        x3 = X3;
        y3 = Y3;
    }

    public String toString(){
        return "I`m Triangle";
    }

    public abstract double areaCalculation() throws Exception;

    }



