/**
 * Hospital Billing System
 * Scenario: Handle multiple exceptions that can occur during billing
 * - Division by zero (bills with zero items)
 * - Array out-of-bounds (invalid patient index)
 * - Number format exceptions (bad input)
 * 
 * A hospital billing system must never crash!
 */

public class HospitalBillingSystem {
    
    // Array to store patient bill amounts
    private double[] patientBills = {1000, 2500, 5000, 3500, 1200};
    
    /**
     * Method to calculate average bill per item
     * 
     * @param patientIndex - Index of patient in array
     * @param numberOfItems - Number of items billed
     * @return Average cost per item
     */
    public double calculateAverageBillPerItem(int patientIndex, int numberOfItems) {
        try {
            // Check for invalid patient index
            if (patientIndex < 0 || patientIndex >= patientBills.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "❌ Invalid patient index: " + patientIndex + 
                    ". Valid range is 0 to " + (patientBills.length - 1)
                );
            }
            
            // Check for division by zero
            if (numberOfItems == 0) {
                throw new ArithmeticException(
                    "❌ Cannot divide bill by zero items. Number of items must be greater than 0."
                );
            }
            
            // Calculate and return average
            double average = patientBills[patientIndex] / numberOfItems;
            System.out.println("✓ Average bill per item: ₹" + average);
            return average;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return -1; // Return -1 to indicate error
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return -1; // Return -1 to indicate error
        }
    }
    
    /**
     * Method to parse bill amount from user input
     * 
     * @param billInput - String input from user
     * @return Bill amount as double
     */
    public double parseBillAmount(String billInput) {
        try {
            if (billInput == null || billInput.trim().isEmpty()) {
                throw new NumberFormatException(
                    "❌ Bill amount cannot be empty. Please enter a valid number."
                );
            }
            
            double billAmount = Double.parseDouble(billInput.trim());
            
            if (billAmount < 0) {
                throw new NumberFormatException(
                    "❌ Bill amount cannot be negative. Please enter a positive number."
                );
            }
            
            System.out.println("✓ Bill amount accepted: ₹" + billAmount);
            return billAmount;
            
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return -1; // Return -1 to indicate error
        }
    }
    
    /**
     * Process patient bill with comprehensive error handling
     * 
     * @param patientIndex - Index of patient
     * @param billAmount - Amount to bill
     * @param numberOfItems - Number of items
     */
    public void processBill(int patientIndex, double billAmount, int numberOfItems) {
        System.out.println("\n--- Processing Bill ---");
        
        // Check for invalid patient index
        try {
            if (patientIndex < 0 || patientIndex >= patientBills.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "❌ Patient index out of bounds: " + patientIndex
                );
            }
            
            // Check for division by zero
            if (numberOfItems == 0) {
                throw new ArithmeticException(
                    "❌ Cannot process bill with 0 items"
                );
            }
            
            // Update patient bill
            patientBills[patientIndex] += billAmount;
            System.out.println("✓ Bill processed successfully!");
            System.out.println("✓ New total for patient " + patientIndex + ": ₹" + patientBills[patientIndex]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("⚠ Bill not processed. Please check patient index.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("⚠ Bill not processed. Check number of items.");
        } catch (Exception e) {
            System.out.println("❌ Unexpected error occurred: " + e.getMessage());
        }
    }
    
    /**
     * Display all patient bills
     */
    public void displayAllBills() {
        System.out.println("\n--- All Patient Bills ---");
        for (int i = 0; i < patientBills.length; i++) {
            System.out.println("Patient " + i + ": ₹" + patientBills[i]);
        }
    }
    
    // Main method to test the system
    public static void main(String[] args) {
        HospitalBillingSystem hospital = new HospitalBillingSystem();
        
        System.out.println("========== HOSPITAL BILLING SYSTEM ==========\n");
        
        // Test Case 1: Valid calculation
        System.out.println("TEST 1: Valid average bill calculation");
        hospital.calculateAverageBillPerItem(0, 5);
        
        // Test Case 2: Invalid patient index (out of bounds)
        System.out.println("\nTEST 2: Invalid patient index");
        hospital.calculateAverageBillPerItem(10, 5);
        
        // Test Case 3: Division by zero
        System.out.println("\nTEST 3: Division by zero (zero items)");
        hospital.calculateAverageBillPerItem(1, 0);
        
        // Test Case 4: Valid bill parsing
        System.out.println("\nTEST 4: Parse valid bill amount");
        hospital.parseBillAmount("1500.50");
        
        // Test Case 5: Invalid bill parsing (non-numeric)
        System.out.println("\nTEST 5: Parse invalid bill amount (non-numeric)");
        hospital.parseBillAmount("abc123");
        
        // Test Case 6: Empty bill input
        System.out.println("\nTEST 6: Parse empty bill amount");
        hospital.parseBillAmount("");
        
        // Test Case 7: Negative bill
        System.out.println("\nTEST 7: Parse negative bill amount");
        hospital.parseBillAmount("-500");
        
        // Test Case 8: Process bill with valid data
        System.out.println("\nTEST 8: Process valid bill");
        hospital.processBill(0, 500, 5);
        
        // Test Case 9: Process bill with invalid index
        System.out.println("\nTEST 9: Process bill with invalid index");
        hospital.processBill(8, 500, 5);
        
        // Test Case 10: Display all bills
        hospital.displayAllBills();
    }
}
