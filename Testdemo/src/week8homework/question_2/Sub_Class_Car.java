package week8homework.question_2;

public class Sub_Class_Car extends Vehicle{

    public static void main(String[] args) {
        Sub_Class_Car C = new Sub_Class_Car();
        C.drive();

    }

    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}
