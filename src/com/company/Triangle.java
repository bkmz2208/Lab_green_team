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

    public int areaCalculation() throws Exception {
        //verification: 3 points on the same line?
        if( (x1-x2)*(y3-y2) == (x3-x2)*(y1-y2) ){
            System.out.println("Triangle doesn`t exist! Points lie on the same line. ");
            throw new Exception();
        }
        else{
            System.out.println("Verification was successful. The triangle exist. ");
        }
        //calculation
        int s;
        s = 1/2 * ( (x1-x3)*(y2-y3) - (y1-y3)*(x2-x3) );
        return s;
    }
}


