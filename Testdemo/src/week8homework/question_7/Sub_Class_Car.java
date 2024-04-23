package week8homework.question_7;

public class Sub_Class_Car extends Vehicle{

    public static void main(String[] args) {
        Sub_Class_Car A = new Sub_Class_Car();
        A.speedUp();



    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Car speed increase by 10");
    }
}





