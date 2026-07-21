package MakerPlanQuestion.BankAccount;

public class BankCustomer {

    int Bank_AccountNumber;
    String Bank_Holder;
    double Bank_Balance;

    static int Bank_TotalAccountNumber;

    public BankCustomer(
            int bank_AccountNumber,
            String bank_Holder,
            double bank_Balance) {

        Bank_AccountNumber = bank_AccountNumber;
        Bank_Holder = bank_Holder;
        Bank_Balance = bank_Balance;

        Bank_TotalAccountNumber++;
    }

    @Override
    public String toString() {

        return "BankAccount{" +
                "Bank_AccountNumber=" + Bank_AccountNumber +
                ", Bank_Holder='" + Bank_Holder + '\'' +
                ", Bank_Balance=" + Bank_Balance +
                '}';
    }
}