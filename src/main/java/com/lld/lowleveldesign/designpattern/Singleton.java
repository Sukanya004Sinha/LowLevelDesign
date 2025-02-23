package com.lld.lowleveldesign.designpattern;

public class Singleton {
    //constructor
    private static Singleton singleton;

    private Singleton() {
        if(singleton!=null){
            throw  new RuntimeException("you are trying to break singleton pattern");
        }

    }
    //Lazy way of creating singleton object
    public static Singleton getSingleton() {
        //object of this class
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
            }

        }
        return singleton;

    }
}


/**
 * 1. constructor should be private
 * 2. create an object with the help of method
 * 3. create field to store object is private
 *
 */