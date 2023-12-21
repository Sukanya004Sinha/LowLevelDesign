package java8features.basic;
interface Infer{
    public  void  add(int a, int b);
    }
/***
class Demo implements Infer{
    public void add(int a, int b){
        System.out.println("Ths Sum:"+(a+b));
    }
}
 **/

public class Add {
    public static void main(String[] args){
//        Infer i = new Demo();
//        i.add(20,40);
        Infer i = (a,b) -> System.out.println(a+b);
        i.add(40,50);
    }
}
