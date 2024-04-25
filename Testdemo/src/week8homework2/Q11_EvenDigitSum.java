package week8homework2;

public class Q11_EvenDigitSum {
    /*
    11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative,the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
     */

    public static void main(String[] args) {
        int number = 6;
        getEvenDigitSum(number);


    }

    static int getEvenDigitSum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum = sum + i;

            }
            System.out.print(sum + " ");

        }


        return sum;
    }
}


