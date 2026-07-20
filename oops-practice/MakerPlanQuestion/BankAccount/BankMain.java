package MakerPlanQuestion.BankAccount;

public class BankMain {

    public static void main(String[] args) {

        BankUtility b1 = new BankUtility();
        BankUtility b2 = new BankUtility();
        BankUtility b3 = new BankUtility();

        b1.createAccount();
        b2.createAccount();
        b3.createAccount();

        // Account 1
        b1.deposit(1000);
        b1.withdraw(500);
        b1.deposit(200);
        b1.withdraw(100);
        b1.deposit(300);

        // Account 2
        b2.deposit(500);
        b2.withdraw(100);
        b2.deposit(200);
        b2.withdraw(50);
        b2.deposit(400);

        // Account 3
        b3.deposit(300);
        b3.withdraw(100);
        b3.deposit(500);
        b3.withdraw(200);
        b3.deposit(100);

        b1.getStatement();
        b2.getStatement();
        b3.getStatement();

        System.out.println("\nTotal Accounts = " + BankCustomer.Bank_TotalAccountNumber);
    }
}