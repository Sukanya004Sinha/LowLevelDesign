package oops.interfaces;

public abstract class Eagle implements Bird{
    @Override
    public void fly(){
        System.out.println("flying birds");
    }

    public abstract void noOfLegs();
}

