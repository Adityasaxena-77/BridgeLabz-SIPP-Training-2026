package level_2;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;


    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance >= 0.0 ? initialBalance : 0.0;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f into account %s.\n", amount, accountNumber);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f from account %s.\n", amount, accountNumber);
        } else {
            System.out.printf("Error: Insufficient funds. Cannot withdraw $%.2f. Current balance: $%.2f\n", amount, balance);
        }
    }


    public void displayBalance() {
        System.out.println("+----------------------------------------+");
        System.out.println("|             ACCOUNT BALANCE            |");
        System.out.println("+----------------------------------------+");
        System.out.printf("| Account Holder : %-21s |\n", accountHolder);
        System.out.printf("| Account Number : %-21s |\n", accountNumber);
        System.out.printf("| Current Balance: $%-20.2f |\n", balance);
        System.out.println("+----------------------------------------+");
        System.out.println();
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class ATMSimulation {
    public static void main(String[] args) {
        System.out.println("=== Running ATM Simulation ===\n");


        BankAccount account = new BankAccount("John Doe", "ACC-12345", 500.00);


        account.displayBalance();


        System.out.println("--- Performing Deposit ---");
        account.deposit(250.50);
        account.displayBalance();


        System.out.println("--- Performing Successful Withdrawal ---");
        account.withdraw(150.00);
        account.displayBalance();


        System.out.println("--- Performing Failed Withdrawal (Insufficient Funds) ---");
        account.withdraw(700.00);
        account.displayBalance();


        System.out.println("--- Testing Error Inputs ---");
        account.deposit(-50.00);
        account.withdraw(0.00);
        System.out.println();


        System.out.println("--- Final Account State ---");
        account.displayBalance();
    }
}
