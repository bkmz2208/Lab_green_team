package com.company;

public class AbstractFactory {
    public static BaseFactory getFactory(String string) {
        if (string.equalsIgnoreCase("white"))
            return new WhiteFactory();
        else return new BlackFactory();
    }
}
