package collection;

public class CarComparable implements Comparable<CarComparable> {
    String carName;
    String carType;

    //Default constructor
    CarComparable() {

    }

    //Parameterized constructor
    CarComparable(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CarComparable)) return false;
        CarComparable other = (CarComparable) obj;
        return carName.equals(other.carName) && carType.equals(other.carType);
    }



@Override
    public int compareTo(CarComparable car){
     return this.carName.compareTo(car.carName);
   }
}
