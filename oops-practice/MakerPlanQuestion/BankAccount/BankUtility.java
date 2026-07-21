package MakerPlanQuestion.BankAccount;

import java.util.Scanner;

public class BankUtility {

    BankCustomer bankCustomer;

    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        int account_Number = (int)(Math.random() * 900000) + 100000;
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        bankCustomer =
                new BankCustomer(
                        account_Number,
                        name,
                        balance
                );
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid Amount");
        }
        else {
            bankCustomer.Bank_Balance += amount;
            System.out.println("Deposited ₹" + amount
            );
        }
    }

    public void withdraw(double amount) {
        if(amount > bankCustomer.Bank_Balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            bankCustomer.Bank_Balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        }
    }

    public void getStatement() {
        System.out.println(bankCustomer);
    }
}