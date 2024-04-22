package week8homework.question_6;

public class Animal {
    /*
    6. Write a Java program to create a base class Animal (Animal Family) with a method
called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
each subclass to make a specific sound for each animal.
     */
    public static void main(String[] args) {
        Animal A = new Animal();
        A.Sound();

    }
    public void Sound(){
        System.out.println("Bird and Cat sounds");
    }
}
