public class InsufficientBalanceException extends Exception {

    double balance;
    double withdrawAmount;

    public InsufficientBalanceException(double balance, double withdrawAmount) {
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public String getMessage() {
        return "Insufficient Balance!\nBalance Amount: " + balance +
               "\nWithdraw Amount: " + withdrawAmount;
    }
}