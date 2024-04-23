package week8homework.question_7;

public class Sub_Class_Bicycle extends Vehicle {

    public static void main(String[] args) {
        Sub_Class_Bicycle B = new Sub_Class_Bicycle();
        B.speedUp();


    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Bicycle has two wheels");
    }
}
