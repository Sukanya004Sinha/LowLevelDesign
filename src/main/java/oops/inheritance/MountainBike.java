package oops.inheritance;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        seatHeight= startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    @Override
     public String toString(){
        return (super.toString()+ "\n seat height  is " + seatHeight );

    }
}
