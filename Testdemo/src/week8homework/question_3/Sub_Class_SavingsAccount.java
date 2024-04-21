package week8homework.question_3;

import java.util.Scanner;

public class Sub_Class_SavingsAccount extends BankAccount{

    public static void main(String[] args) {
        Sub_Class_SavingsAccount S = new Sub_Class_SavingsAccount();
        S.deposit();
        S.withdraw();

    }

    @Override
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        int number = 100, number1 = 150, number3 = 50;

        if (number<number3){
            System.out.println("Don't allow to withdraw money from account");
        } else if (number>number1) {
            System.out.println("Allow to withdraw money from account");
        } else if (number3<number){
            System.out.println("Don't allow to withdraw money from account");
        } else
            System.out.println("Block card");



    }
}
