package week8homework.question_6;

public class Sub_Class_Cat extends Animal {
    /*
    Create two subclasses Bird and Cat. Override the Sound() method in
each subclass to make a specific sound for each animal.
     */
    public static void main(String[] args) {
        Sub_Class_Cat S = new Sub_Class_Cat();
        S.Sound();

    }

    @Override
    public void Sound() {
        System.out.println("Cat sound like meow, meow, meow, meow, meow");
    }
}
