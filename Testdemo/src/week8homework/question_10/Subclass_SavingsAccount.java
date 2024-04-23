package week8homework.question_10;

public class Subclass_SavingsAccount extends BankAccount {

    public static void main(String[] args) {
        Subclass_SavingsAccount s = new Subclass_SavingsAccount();
        s.withdraw();

    }

    @Override
    public void withdraw() {
        super.withdraw();

        int k = 200, l = 300;

        if (l>k){
            System.out.println("charge extra fees");
        }


    }
}
