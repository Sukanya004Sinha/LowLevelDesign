package oops.classandobjects;

/**
 * Method Overloading - Same number of paraneter but differnt types or different numbers of parameter but same types
 */
class Calculators{
    public int add (int n1, int n2){
        int sum = n1+n2;
        return sum;
    }
    public int add (int n1, int n2, int n3){
        int sum = n1+n2+n3;
        return sum;
    }
    public double add (double n1, double n2, double n3){

        return  n1+n2+n3;
    }
}
public class Demo {
    public static void main(String[] args){
        Calculators obj = new Calculators();
        int test = obj.add(3,4, 5);
        double test1 = obj.add(3.0, 4.5, 9.0);
        System.out.println(test);
        System.out.println(test1);
    }

}

