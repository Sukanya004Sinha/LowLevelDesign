package oops.javaClasses;

public class Audi extends LuxuryCar{


    /**  public Audi(int mileage) {
        System.out.println("Audi Constructor");
        super(mileage);
   The issue in your constructor is that the super(mileage) call must be the first statement in the constructor. In Java, the super keyword is used to call the parent class's constructor, and it must always be the first line in the constructor. If you try to call it after other statements, it will result in a compilation error. So, you need to ensure that super(mileage) is the first line in your Audi constructor. }*/;

    public Audi(int mileage) {
        super(mileage);
        System.out.println("Audi Constructor");
    }

    @Override
    public void pressDualBreakSystem() {
        System.out.println("Pressing Dual Break System");

    }

    @Override
    public void pressClutch(){
        System.out.println("Pressing Clutch");
    }
    public void pressBreak(){
        super.pressBreak();
        System.out.println("Pressing Break child class");
    }
   public  static  void main(String[] args){
        Audi a = new Audi(20);
        a.pressDualBreakSystem();
        a.pressClutch();
        a.pressBreak();
        System.out.println("Mileage is " +a.mileage);


   }
}

