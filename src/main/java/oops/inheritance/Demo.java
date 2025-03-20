package oops.inheritance;

public class Demo {
    public static void main(String[] args){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(9,6);
        int  r3= obj.multi(4,5);
        int r4 = obj.div(8,4);
        int r5 = (int) obj.power(4,2);

        System.out.println(r1 + " " +r2+ " " + r3 + " " + r4 + " " + r5);

    }
}
/**
 * when you have multiple layers then it is called multilevel inheritance
 * like in this example calc extends AdvCalc and veryAdvCalc
 * when you have single layers then it is called single inheritance
 * like in this example AdvCalc extends Calc
 *
 * in java does Multiple inheritance supports?
 * No java does not support multiple inheritance because of Ambiguity or diamond problem *  is when you have two classes and both classes have same method and you are calling that method from child class so its not clear which method should be called so there is ambiguity so java removes that features
 */
