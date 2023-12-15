package com.lld.lowleveldesign;

import com.lld.lowleveldesign.designpattern.Singleton;
import com.lld.lowleveldesign.designpattern.Singleton1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class LowleveldesignApplication {
/****
 * 1. Reflection Api to break singleton pattern
 * solution 1 > if object is already there => throws exception from inside constructor
 * 2. Enum
 */

public static void main(String[] args) throws Exception{
	SpringApplication.run(LowleveldesignApplication.class, args);
	Singleton singleton1 = Singleton.getSingleton();
	System.out.println(singleton1.hashCode());
	Constructor<Singleton> constructor= Singleton.class.getDeclaredConstructor();
	constructor.setAccessible(true);
	Singleton singleton2 = constructor.newInstance();
	System.out.println(singleton2.hashCode());

//	Singleton singleton2 = Singleton.getSingleton();
//	System.out.println(singleton2.hashCode());
//	System.out.println(Singleton1.getSingleton1().hashCode());
//	System.out.println(Singleton1.getSingleton1().hashCode());
}
}
