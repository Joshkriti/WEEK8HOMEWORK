package week8homework.question_2;

public class Vehicle {
    /*
    2. Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a
car".
     */

    public static void main(String[] args) {
        Vehicle V = new Vehicle();
        V.drive();

    }

    public void drive(){
        System.out.println("I drive Vauxhall corsa");
    }

}
