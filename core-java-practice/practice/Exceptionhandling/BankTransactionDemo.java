public class BankTransactionDemo {
    private double balance = 1000.0;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankTransactionDemo account = new BankTransactionDemo();

        try {
            account.withdraw(1200);
            System.out.println("Withdrawal successful, new balance: " + account.balance);
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}
