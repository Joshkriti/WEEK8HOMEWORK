package week8homework.question_10;

public class Subclass_CheckingAccount extends BankAccount {
    /* Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees. */

    public static void main(String[] args) {
        Subclass_CheckingAccount s = new Subclass_CheckingAccount();
        s.withdraw();

    }

    @Override
    public void withdraw() {
        super.withdraw();
        int a = 200, b = 100;

        if (a>b){
            System.out.println("Let user withdraw money");
        } else {
            System.out.println("Block card");
        }
    }
}
