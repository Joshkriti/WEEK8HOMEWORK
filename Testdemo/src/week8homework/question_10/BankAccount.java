package week8homework.question_10;

public class BankAccount {
    /*
    10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.
     */

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit();
        b.withdraw();

    }

    public void deposit(){
        System.out.println("I want to deposit £100.");
    }

    public void withdraw(){
        System.out.println("But I have withdraw £50..");
    }


}
