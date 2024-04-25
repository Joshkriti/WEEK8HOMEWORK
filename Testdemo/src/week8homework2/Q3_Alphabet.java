package week8homework2;

import java.util.Scanner;

public class Q3_Alphabet {

    /*
    3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any alphabet: ");
        String input = sc.next().toLowerCase();
        char input1 = sc.next().charAt(0);

        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") ||
                input.equals("o")  ||  input.equals("u")  ||  input.equals("A")  ||  input.equals("E")  ||
                input.equals("I")  ||  input.equals("U")  ||  input.equals("O");

        if (input.length() > 1) {
            System.out.println("Input is not alphabet");
        } else if ((input1 >= 'a' && input1 <= 'z') || (input1 >= 'A' && input1 <= 'Z')){
            System.out.println(input1 + "is a consonant");
        } else if (vowels){
            System.out.println("Letter is vowel");
        } else {
            System.out.println("Java");
        }




    }






}
