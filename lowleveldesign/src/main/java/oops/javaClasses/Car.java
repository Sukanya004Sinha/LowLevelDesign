package oops.javaClasses;

/**  Abstract class means (0 to 100% Abstraction)
 * Show only important features to users and hides its implementation details
 * There are 2 ways to achieve the abstraction in java
 * 1 . Interface
 * 2. Abstract class
 * Class is declared as abstract through keyword "Abstract"
 * we can not create an instance of this class
 *
 * Abstract class can have both Abstract class and Method which have implementation
 * if Parent has some features which all child  classes have in common , then this can be used
 * Constructor can be created inside them. And with Super keyword from child classes we can access them.
 *
 */
public abstract class Car {
    int mileage;
    Car(int mileage){
        this.mileage = mileage;
    }
    public abstract void pressBreak();
    public abstract void pressClutch();
    public int getNumbersOfWheels(){
        return 4;
    }
}
