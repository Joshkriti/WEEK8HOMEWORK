package week8homework.question_9;

public class Animal {
    /*
    9. Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal.
     */

    public static void main(String[] args) {
        Animal A = new Animal();
        A.move();
        A.makeSound();

    }

    public void move(){
        System.out.println("Animal moves very fast");
    }
    public void makeSound(){
        System.out.println("How bird make sound?");
    }
}
