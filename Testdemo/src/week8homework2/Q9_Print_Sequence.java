package week8homework2;

public class Q9_Print_Sequence {

    // 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

    public static void main(String[] args) {
        int number = 10;
        Fibonacci(number);

    }

   static void Fibonacci(int number){
        int firstNumber = 0;
        int secondNumber = 1;
       System.out.println("Fibonacci number in sequence up tp " + number + " : ");

       {
           for (int i = 0; i < number; i++) {
               System.out.print(firstNumber + " ");

               int thirdNumber = firstNumber + secondNumber;
               firstNumber = secondNumber;
               secondNumber = thirdNumber;


           }


       }

   }
}
