package oops.javaClasses;

public abstract class LuxuryCar extends  Car{
    //Constructor
    LuxuryCar(int mileage){
        super(mileage);
    }
    //Abstract method
    public abstract void pressDualBreakSystem();
    @Override
    public void pressBreak(){
        System.out.println("Pressing Break");
    }

}
