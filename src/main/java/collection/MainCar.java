package collection;

import java.util.Arrays;

public class MainCar {
    public static void main(String[] args){
        Car[] carArray = new Car[3];
        carArray[0] = new Car("Suv", "petrol");
        carArray[1] = new Car("Sedan", "diesel");
        carArray[2] = new Car("Hatchback", "cng");

       // Arrays.sort(carArray);
        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj1.carName.compareTo(obj2.carName));
        for(Car car : carArray){
            System.out.println(car.carName + ".." + car.carType);
        }
        ;


    }
}
