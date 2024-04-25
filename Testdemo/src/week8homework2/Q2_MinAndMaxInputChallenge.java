package week8homework2;

import java.util.Scanner;

public class Q2_MinAndMaxInputChallenge {
    /*
    2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k,max=0, min=0;
        for (int a = 1; a <=5; a++){
            System.out.println("Enter number: ");
            k = scanner.nextInt();

            if (max<k)
                max= k;
            if (max>k)
                min=k;
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

    }


}
