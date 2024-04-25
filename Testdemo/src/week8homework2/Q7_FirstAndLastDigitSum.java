package week8homework2;

public class Q7_FirstAndLastDigitSum {

    /*
    7. First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needsto find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needsto return -1 to indicate an invalid value.

Example input/output
* sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
* sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
     */

    public static void main(String[] args) {
        sumFirstAndLastDigit(4563);

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 10)
            return -1;
        int lastDigit = number % 10;

        int firstDigit = number;
        while (firstDigit >= 10){
            firstDigit=firstDigit/10;
            }

        System.out.println("first digit: " + firstDigit);
        System.out.println("last digit: " + lastDigit);
        System.out.println("sum of first and lst digit: " + firstDigit + lastDigit);




       /*int  lastDigit = lastDigit % 10;

        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

            System.out.println("sum of first digit: " + sumFirstAndLastDigit(4563));
            System.out.println("sum of last digit: " + sumFirstAndLastDigit(4563));
            System.out.println("sum of first and last digit: " + (sumFirstAndLastDigit(4563)));
*/

        return lastDigit;
    }

    }




