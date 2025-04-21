package oops.javaClasses;

/***Concrete Classes -> These are those class that we can create an instance of NEW Keyword
 * All the methods in this class have implementation.
 * It can also be your child class from interface or extend abstract class.
 *A Class modifier can be "Public" or "Package private" (no explicit modifier  defined
 * public class Rectangle implements Shape{
 * @Override
 * public void computeArea(){
 *     System..out.println("Compute Rectangle Area");
 * }
 * }
 * And here is the interface of this Abstract Class
 * public interface Shape(){
 *     public void ComputeArea();
 * }
 */
public class Shape {
    int length;
    int breadth;
    public Shape(){
        System.out.println("Shape Constructor");
    }

    public Shape(int length, int breadth){
        this.length= length;
        this .breadth= breadth;

    }
    public int computeArea(int length, int breadth){
        System.out.println("Compute Area");
        return length*breadth;
    }


}
