package week8homework2;

public class Q14_While_loop {
    /*
    14. Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
     */

    public static void main(String[] args) {

        for (int i = 5; i > -5; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }
}