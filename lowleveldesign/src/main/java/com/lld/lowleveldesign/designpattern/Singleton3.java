package com.lld.lowleveldesign.designpattern;

import java.io.Serializable;

public class Singleton3 implements Serializable,Cloneable {
    private static Singleton3 singleton3;

    private Singleton3() {


    }

    //Lazy way of creating singleton object
    public static Singleton3 getSingleton3() {
        //object of this class
        if (singleton3 == null) {
            synchronized (Singleton.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }

            }
        }
            return singleton3;

        }
    public Object readResolve(){
        return singleton3;

  }
  @Override
  public Object clone() throws CloneNotSupportedException{
        return singleton3;
  }

}

