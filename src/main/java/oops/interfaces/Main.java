package oops.interfaces;

public class Main {
    public static void main(String[] args){
        Bird bird = new Eagle();
        Bird bird1 = new Hen();
        bird.fly();
        bird1.fly();
    }
}
