package week8homework2.q23_methodoverriding23;

public class Bike2 extends Vehicle{

    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 b = new Bike2();
        b.run();
    }
}
