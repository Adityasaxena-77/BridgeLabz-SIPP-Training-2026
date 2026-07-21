package BankAccount;

public class BankUtility {
    BankCustomer bankCustomer;

    public void createAccount(String name) {
        bankCustomer = new BankCustomer(12345, name, 0);
        System.out.println("Account created successfully for " + name + ".");
    }

    public void deposit(double amount) {
        if (bankCustomer == null) {
            System.out.println("No account exists. Please create an account first.");
            return;
        }
        bankCustomer.deposit(amount);
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (bankCustomer == null) {
            System.out.println("No account exists. Please create an account first.");
            return;
        }
        if (bankCustomer.withdraw(amount)) {
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void getStatement() {
        if (bankCustomer == null) {
            System.out.println("No account exists. Please create an account first.");
            return;
        }
        bankCustomer.printStatement();
    }
}
