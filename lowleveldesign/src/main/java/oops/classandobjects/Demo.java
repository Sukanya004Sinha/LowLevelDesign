package oops.classandobjects;
class Calculators{
    public int add1 (int n1, int n2){
        int sum = n1+n2;
        return sum;
    }

}
public class Demo {
    public static void main(String[] args){
        Calculators obj = new Calculators();
        int test = obj.add1(3,4);
        System.out.println(test);
    }

}

