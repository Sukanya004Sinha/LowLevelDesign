package oops.interfaces;

public interface Car {
    public void canFly();

    default int getFlyingHeight(){
        return 100;
    }
}
