package BankingSystem;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNumber("SA101");
        savings.setHolderName("Rahul");
        savings.setBalance(10000);
        savings.setInterestRate(5);

        savings.deposit(2000);
        savings.withdraw(1500);

        System.out.println("----- Savings Account -----");
        savings.displayAccountDetails();
        System.out.println("Interest : " + savings.calculateInterest());

        System.out.println();

        CurrentAccount current = new CurrentAccount();
        current.setAccountNumber("CA201");
        current.setHolderName("Priya");
        current.setBalance(20000);
        current.setMonthlyBonusRate(2);

        current.deposit(5000);
        current.withdraw(3000);

        System.out.println("----- Current Account -----");
        current.displayAccountDetails();
        System.out.println("Interest : " + current.calculateInterest());
    }
}