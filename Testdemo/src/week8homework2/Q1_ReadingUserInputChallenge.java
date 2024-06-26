package week8homework2;

import java.util.Scanner;

public class Q1_ReadingUserInputChallenge {
    /*
    1. Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returnsfalse, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add itto the sum.
-Before the user enters each number, print the message Enter number #x: where x representsthe
count, i.e. 1, 2, 3, 4, etc.
-For example,the first message printed to the user would be Enter number #1:,the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + ":");
            int number = scanner.nextInt();
            sum += number;

        }
        System.out.println("Print sum of the 10 number: " + sum);

        System.out.println("Invalid Number");


    }


}
