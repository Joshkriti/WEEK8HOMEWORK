package week8homework2;

public class Q4_DigitSumChallenge {

    /*
    4. Digit Sum Challenge
Write a method with the name sumDigitsthat has one int parameter called number.
If the parameter is >= 10 then the method should processthe number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbersfrom0-9 have 1 digitso we don't want to processthem; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1)should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
Hint: Use n % 10 to extract the least-significant digit.
Use n = n / 10 to discard the least-significant digit.
The method needs to be static
Create a class with the name DigitSumChallenge.
     */

    public static void main(String[] args) {
        sumDigits(256);

    }

    public static int sumDigits(int number){
        if (number < 10)
            return -1;

        int sumDigits = 0;
        while (number > 0){
            sumDigits = sumDigits + number % 10;
            number = number / 10;
        }
        System.out.println(sumDigits);


        return sumDigits;
    }
}


