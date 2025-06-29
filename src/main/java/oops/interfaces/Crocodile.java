package oops.interfaces;

//public class Crocodile implements WaterAnimal, LandAnimal{ //Creating Diamond Problem
    public class Crocodile extends LandAnimal{
        @Override
    public boolean canBreath(){
        return true;
    }
}
