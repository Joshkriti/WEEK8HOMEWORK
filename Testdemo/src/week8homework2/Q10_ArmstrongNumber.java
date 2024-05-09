package week8homework2;

import java.util.Scanner;

public class Q10_ArmstrongNumber {
    /*
    10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;

        while (number > 0) {
            sum = sum + (number % 10) * (number % 10) * (number % 10);
            number = number / 10;
        }


    }
}
