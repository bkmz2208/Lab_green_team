package com.company;

public class Main {
    public static void main(String []args){

        BaseFactory whiteFactory = new WhiteFactory();
        BaseFactory blackFactory = new BlackFactory();
       Circle blackCircle = blackFactory.createCircle(3);
        System.out.println(blackCircle);


    }
}
