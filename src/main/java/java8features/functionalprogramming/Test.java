package java8features.functionalprogramming;
interface Inter {
    public void m1();
    }
/**
class Demo implements Interf{
    public void m1(){
        System.out.println("Hello.......");
    }
}
 **/
public class Test {
    public static void main(String[] args){
//        Demo d  = new Demo();
//        d.m1();
        Inter i = ()-> System.out.println("Hello.......By Lambda expression");
        i.m1();


    }
}
