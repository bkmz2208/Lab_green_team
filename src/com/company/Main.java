package com.company;


public class Main {
    public static void main(String []args)throws Exception{

        System.out.println("---------------------");
        BaseFactory whiteFactory = AbstractFactory.getFactory("white");
        BaseFactory blackFactory = AbstractFactory.getFactory("black");
        whiteCircleCreation(whiteFactory, 4);
        System.out.println();
        blackCircleCreation(blackFactory, 2);
        System.out.println("---------------------");
        whiteTriangleCreation(whiteFactory, 1,2,0,0,2,-1);
        System.out.println();
        blackTriangleCreation(blackFactory, 2,1,0,0,-1,-2);

    }

    public static void whiteCircleCreation(BaseFactory factory, int radius){
        Circle whiteCircle = factory.createCircle(radius);
        System.out.println("--------WHITE CIRCLE------");
        System.out.println(whiteCircle);
        System.out.println("Area of white circle: "+ whiteCircle.areaCalculation());
    }

    public static void blackCircleCreation(BaseFactory factory, int radius){
        Circle blackCircle = factory.createCircle(radius);
        System.out.println("--------BLACK CIRCLE------");
        System.out.println(blackCircle);
        System.out.println("Area of black circle: "+ blackCircle.areaCalculation());
    }

    public static void whiteTriangleCreation(BaseFactory factory, int X1, int Y1, int X2, int Y2, int X3, int Y3) throws Exception {
        Triangle whiteTriangle = factory.createTriangle(X1,X2,X3,Y1,Y2,Y3);
        System.out.println("--------WHITE TRIANGLE------");
        System.out.println(whiteTriangle);
        System.out.println("Area of white triangle: "+ whiteTriangle.areaCalculation());
    }
    public static void blackTriangleCreation(BaseFactory factory, int X1, int Y1, int X2, int Y2, int X3, int Y3) throws Exception {
        Triangle blackTriangle = factory.createTriangle(X1,X2,X3,Y1,Y2,Y3);
        System.out.println("--------BLACK TRIANGLE------");
        System.out.println(blackTriangle);
        System.out.println("Area of black triangle: "+ blackTriangle.areaCalculation());
    }
}
