package oops.exceptionHandling;

public class Test {
    public static void main(String[] args){
        Test sampleObj = new Test();
        sampleObj.method1();
    }
    private void method1(){
        method2();
    }
    private void method2(){
        method3();

    }
    private void method3(){
        int b = 5/0;
    }
}
