package com.company;

public class Main {
    public static void main(String []args){

        System.out.println("---------------------");
        BaseFactory whiteFactory = AbstractFactory.getFactory("white");
        BaseFactory blackFactory = AbstractFactory.getFactory("black");
        Circle blackCircle = blackFactory.createCircle(3);
        Circle whiteCircle = whiteFactory.createCircle(4);
        System.out.println("--------BLACK CIRCLE------");
        System.out.println(blackCircle);
        System.out.println("--------WHITE CIRCLE------");
        System.out.println(whiteCircle);
        System.out.println();

    }
}
