package com.company;

public interface AbstractFactory {
     static BaseFactory getFactory(String string) {
        if (string.equalsIgnoreCase("white"))
            return new WhiteFactory();
        else return new BlackFactory();
    }
}
