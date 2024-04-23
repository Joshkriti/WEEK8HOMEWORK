package week8homework.question_9;

public class Sub_Class_Panthera extends Sub_Class_Bird{

    public static void main(String[] args) {
        Sub_Class_Panthera S = new Sub_Class_Panthera();
        S.makeSound();
        S.move();


    }

    @Override
    public void move() {
        System.out.println("It moves very fast.");
    }

    @Override
    public void makeSound() {
        System.out.println("No sound, can't talk right now");
    }
}
