package week8homework.question_3;

public class BankAccount {
    /*
    3. Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred.
     */

    public static void main(String[] args) {
        BankAccount B = new BankAccount();
        B.deposit();  // Calling both instance method to main body
        B.withdraw();

    }

    // Creating Instance method
    public void deposit(){
        System.out.println("I deposit £100");
    }
    public void withdraw(){
        System.out.println("I withdraw £50");
    }
}
