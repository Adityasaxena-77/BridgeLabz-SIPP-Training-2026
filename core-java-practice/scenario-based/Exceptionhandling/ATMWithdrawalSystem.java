/**
 * ATM Withdrawal System
 * Scenario: Handle withdrawal requests with insufficient balance
 * 
 * Account balance = ₹5,000
 * Withdrawal request = ₹8,000
 * 
 * Custom Exception: InsufficientBalanceException
 */

// Custom Exception Class
class InsufficientBalanceException extends Exception {
    private double requestedAmount;
    private double availableBalance;
    private double shortfall;
    
    /**
     * Constructor for InsufficientBalanceException
     * 
     * @param message - Error message
     * @param requested - Amount requested to withdraw
     * @param available - Available balance in account
     */
    public InsufficientBalanceException(String message, double requested, double available) {
        super(message);
        this.requestedAmount = requested;
        this.availableBalance = available;
        this.shortfall = requested - available;
    }
    
    // Getters to access exception information
    public double getRequestedAmount() {
        return requestedAmount;
    }
    
    public double getAvailableBalance() {
        return availableBalance;
    }
    
    public double getShortfall() {
        return shortfall;
    }
}

// ATM Account Class
public class ATMWithdrawalSystem {
    private double accountBalance;
    private String accountHolder;
    private int accountNumber;
    
    /**
     * Constructor to initialize ATM account
     */
    public ATMWithdrawalSystem(String accountHolder, int accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalance = initialBalance;
    }
    
    /**
     * Method to withdraw money from account
     * Throws InsufficientBalanceException if balance is insufficient
     * 
     * @param withdrawalAmount - Amount to withdraw
     * @return true if withdrawal successful
     * @throws InsufficientBalanceException if balance is insufficient
     */
    public boolean withdraw(double withdrawalAmount) throws InsufficientBalanceException {
        // Validate withdrawal amount
        if (withdrawalAmount <= 0) {
            throw new IllegalArgumentException("❌ Withdrawal amount must be greater than 0");
        }
        
        // Check if balance is sufficient
        if (withdrawalAmount > accountBalance) {
            throw new InsufficientBalanceException(
                "❌ INSUFFICIENT BALANCE!",
                withdrawalAmount,
                accountBalance
            );
        }
        
        // Deduct amount from balance
        accountBalance -= withdrawalAmount;
        System.out.println("✓ Withdrawal successful!");
        System.out.println("✓ Amount withdrawn: ₹" + withdrawalAmount);
        System.out.println("✓ Remaining balance: ₹" + accountBalance);
        return true;
    }
    
    /**
     * Display account details
     */
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + accountBalance);
    }
    
    /**
     * Deposit money into account
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Deposit amount must be greater than 0");
            return;
        }
        accountBalance += amount;
        System.out.println("✓ Deposit successful! Amount: ₹" + amount);
        System.out.println("✓ New balance: ₹" + accountBalance);
    }
    
    /**
     * Main method to test ATM system
     */
    public static void main(String[] args) {
        System.out.println("========== ATM WITHDRAWAL SYSTEM ==========\n");
        
        // Create ATM account with initial balance of ₹5,000
        ATMWithdrawalSystem atm = new ATMWithdrawalSystem("Raj Kumar", 123456, 5000);
        atm.displayAccountDetails();
        
        // Test Case 1: Valid withdrawal
        System.out.println("\n--- TEST 1: Valid Withdrawal (₹2,000) ---");
        try {
            atm.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            handleInsufficientBalance(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Test Case 2: Another valid withdrawal
        System.out.println("\n--- TEST 2: Another Valid Withdrawal (₹1,500) ---");
        try {
            atm.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            handleInsufficientBalance(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Display current balance
        atm.displayAccountDetails();
        
        // Test Case 3: Insufficient balance - withdrawal > balance
        System.out.println("\n--- TEST 3: Insufficient Balance (₹8,000 withdrawal) ---");
        try {
            atm.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            handleInsufficientBalance(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Test Case 4: Exact withdrawal of remaining balance
        System.out.println("\n--- TEST 4: Exact Withdrawal (₹1,500) ---");
        try {
            atm.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            handleInsufficientBalance(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Test Case 5: Withdrawal from empty account
        System.out.println("\n--- TEST 5: Withdrawal from Empty Account (₹1,000) ---");
        try {
            atm.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            handleInsufficientBalance(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Test Case 6: Negative withdrawal
        System.out.println("\n--- TEST 6: Negative Withdrawal Amount (-₹500) ---");
        try {
            atm.withdraw(-500);
        } catch (InsufficientBalanceException e) {
            handleInsufficientBalance(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Test Case 7: Deposit money
        System.out.println("\n--- TEST 7: Deposit Money (₹5,000) ---");
        atm.deposit(5000);
        atm.displayAccountDetails();
        
        // Final account details
        System.out.println("\n--- FINAL Account Status ---");
        atm.displayAccountDetails();
    }
    
    /**
     * Helper method to handle InsufficientBalanceException
     */
    private static void handleInsufficientBalance(InsufficientBalanceException e) {
        System.out.println(e.getMessage());
        System.out.println("📊 Details:");
        System.out.println("   Requested Amount: ₹" + e.getRequestedAmount());
        System.out.println("   Available Balance: ₹" + e.getAvailableBalance());
        System.out.println("   Shortfall: ₹" + e.getShortfall());
        System.out.println("⚠ Withdrawal cancelled. Please enter a lower amount.");
    }
}
