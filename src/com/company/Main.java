package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String []args){

        System.out.println("---------------------");
        BaseFactory whiteFactory = AbstractFactory.getFactory("white");
        BaseFactory blackFactory = AbstractFactory.getFactory("black");

        System.out.println();


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

}
