package com.lld.lowleveldesign.designpattern;

import java.io.Serializable;

public enum Singleton2 implements Serializable {
    INSTANCE;
 public void test(){
     System.out.println("test method");
 }
}
