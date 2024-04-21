package week8homework.question_4;

public class Sub_Class_Cheetah extends Animal{

    public static void main(String[] args) {
        Sub_Class_Cheetah S = new Sub_Class_Cheetah();
        S.move();

    }

    @Override
    public void move() {
        System.out.println("Method to run");
    }
}
