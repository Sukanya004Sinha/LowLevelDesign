package com.lld.lowleveldesign;

import com.lld.lowleveldesign.designpattern.Singleton;
import com.lld.lowleveldesign.designpattern.Singleton1;
import com.lld.lowleveldesign.designpattern.Singleton2;
import com.lld.lowleveldesign.designpattern.Singleton3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

@SpringBootApplication
public class LowleveldesignApplication {
/****
 *
 * 1. Reflection Api to break singleton pattern
 * solution 1 > if object is already there => throws exception from inside constructor
 * 2. Enum
 * 2=> Deserialization
 * solution : implementing read resolve
 *
 * 3=> Cloning
 */

public static void main(String[] args) throws Exception,CloneNotSupportedException{
	SpringApplication.run(LowleveldesignApplication.class, args);
//	Singleton2 s2 = Singleton2.INSTANCE;
//	System.out.println(s2.hashCode());
//	s2.test();

	//Singleton singleton1 = Singleton.getSingleton();
//	Singleton2 singleton1 = Singleton2.INSTANCE;
////	Singleton singleton1 = Singleton.getSingleton();
//	System.out.println(singleton1.hashCode());
//	Constructor<Singleton2> constructor= Singleton2.class.getDeclaredConstructor();
//	constructor.setAccessible(true);
//	Singleton2 singleton2 = constructor.newInstance();
//	System.out.println(singleton2.hashCode());

//	Singleton singleton2 = Singleton.getSingleton();
//	System.out.println(singleton2.hashCode());
//	System.out.println(Singleton1.getSingleton1().hashCode());
//	System.out.println(Singleton1.getSingleton1().hashCode());
    Singleton3 singleton3 = Singleton3.getSingleton3();
    System.out.println(singleton3.hashCode());
//	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//    oos.writeObject(single3);
	System.out.println("serialization done....");
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
   Singleton3 s3 = (Singleton3) ois.readObject();
   System.out.println(s3.hashCode());
    Singleton3 s4=(Singleton3)singleton3.clone();
    System.out.println(s4.hashCode());

}
}
