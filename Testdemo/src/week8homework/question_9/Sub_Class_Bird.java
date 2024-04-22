package week8homework.question_9;

public class Sub_Class_Bird extends Animal{

    public static void main(String[] args) {
        Sub_Class_Bird S = new Sub_Class_Bird();
        S.makeSound();
        S.move();

    }

    @Override
    public void move() {
        System.out.println("The movement of Duck is very slow ");
    }

    @Override
    public void makeSound() {
        System.out.println("Sound of duck is quack, quack, quack, quack");
    }
}
