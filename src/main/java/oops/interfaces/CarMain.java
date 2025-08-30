package oops.interfaces;

public class CarMain {
    public static void main(String[] args){
        Car carObj = new XUV();
        int flyingHeight = carObj.getFlyingHeight();
        System.out.println(carObj.getFlyingHeight());
       carObj.canFly();


    }
}
