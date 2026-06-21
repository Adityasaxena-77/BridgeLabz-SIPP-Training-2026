/**
 * Password Strength Checker
 * A comprehensive password validator with detailed exception handling
 * 
 * Password Rules:
 * 1. First character must be uppercase
 * 2. Last character must be a digit
 * 3. Length must be at least 8 characters
 * 4. Must contain at least one special character (@, #, $, %, &, *)
 * 
 * Possible Exceptions:
 * - null input
 * - empty string
 * - length < 8
 * - no uppercase at start
 * - no digit at end
 * - no special character
 */

public class PasswordStrengthChecker {
    
    private static final int MIN_LENGTH = 8;
    private static final String SPECIAL_CHARS = "@#$%&*";
    
    /**
     * Check if password is strong
     * Validates all password rules and handles exceptions gracefully
     * 
     * @param password - Password to check
     * @return true if password is strong, false otherwise
     */
    public boolean checkPassword(String password) {
        System.out.println("\n--- Checking Password Strength ---");
        
        try {
            // Handle null input
            if (password == null) {
                throw new NullPointerException(
                    "❌ PASSWORD ERROR: Password cannot be null (empty)"
                );
            }
            
            // Handle empty string
            if (password.isEmpty() || password.trim().isEmpty()) {
                throw new IllegalArgumentException(
                    "❌ PASSWORD ERROR: Password cannot be empty"
                );
            }
            
            // Get trimmed password
            String pwd = password.trim();
            
            // Rule 1: Minimum length check
            if (pwd.length() < MIN_LENGTH) {
                throw new IllegalArgumentException(
                    "❌ LENGTH ERROR: Password must be at least " + MIN_LENGTH + 
                    " characters long (Current length: " + pwd.length() + ")"
                );
            }
            
            // Rule 2: First character must be uppercase
            char firstChar = pwd.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                throw new IllegalArgumentException(
                    "❌ FIRST CHARACTER ERROR: First character must be uppercase" +
                    "\n   Current: '" + firstChar + "' is not uppercase"
                );
            }
            
            // Rule 3: Last character must be a digit
            char lastChar = pwd.charAt(pwd.length() - 1);
            if (!Character.isDigit(lastChar)) {
                throw new IllegalArgumentException(
                    "❌ LAST CHARACTER ERROR: Last character must be a digit" +
                    "\n   Current: '" + lastChar + "' is not a digit"
                );
            }
            
            // Rule 4: Must contain at least one special character
            boolean hasSpecialChar = false;
            for (char c : pwd.toCharArray()) {
                if (SPECIAL_CHARS.indexOf(c) != -1) {
                    hasSpecialChar = true;
                    break;
                }
            }
            
            if (!hasSpecialChar) {
                throw new IllegalArgumentException(
                    "❌ SPECIAL CHARACTER ERROR: Password must contain at least one special character" +
                    "\n   Allowed special characters: " + SPECIAL_CHARS
                );
            }
            
            // All checks passed
            System.out.println("✓ PASSWORD IS STRONG!");
            System.out.println("  ✓ Length: " + pwd.length() + " characters (minimum: " + MIN_LENGTH + ")");
            System.out.println("  ✓ First character: '" + firstChar + "' (uppercase)");
            System.out.println("  ✓ Last character: '" + lastChar + "' (digit)");
            System.out.println("  ✓ Contains special character");
            return true;
            
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return false;
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
            
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("❌ STRING ERROR: " + e.getMessage());
            return false;
            
        } catch (Exception e) {
            System.out.println("❌ UNEXPECTED ERROR: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Detailed password validation with individual error messages
     * 
     * @param password - Password to validate
     * @return true if valid, false otherwise
     */
    public boolean validatePasswordDetailed(String password) {
        System.out.println("\n--- Detailed Password Validation ---");
        
        boolean allValid = true;
        
        // Check 1: Null
        try {
            if (password == null) {
                throw new NullPointerException("Password is null (empty input)");
            }
            System.out.println("✓ Check 1: Not null");
        } catch (NullPointerException e) {
            System.out.println("❌ Check 1: " + e.getMessage());
            allValid = false;
        }
        
        if (password == null) return false; // Exit if null
        
        // Check 2: Not empty
        try {
            if (password.isEmpty()) {
                throw new IllegalArgumentException("Password is empty");
            }
            System.out.println("✓ Check 2: Not empty");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Check 2: " + e.getMessage());
            allValid = false;
        }
        
        if (password.isEmpty()) return false; // Exit if empty
        
        // Check 3: Length >= 8
        try {
            if (password.length() < MIN_LENGTH) {
                throw new IllegalArgumentException(
                    "Length is " + password.length() + ", must be at least " + MIN_LENGTH
                );
            }
            System.out.println("✓ Check 3: Length is at least " + MIN_LENGTH + 
                             " characters (actual: " + password.length() + ")");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Check 3: " + e.getMessage());
            allValid = false;
        }
        
        // Check 4: First character is uppercase
        try {
            char first = password.charAt(0);
            if (!Character.isUpperCase(first)) {
                throw new IllegalArgumentException(
                    "First character '" + first + "' is not uppercase"
                );
            }
            System.out.println("✓ Check 4: First character '" + first + "' is uppercase");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Check 4: " + e.getMessage());
            allValid = false;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("❌ Check 4: Cannot access first character");
            allValid = false;
        }
        
        // Check 5: Last character is digit
        try {
            char last = password.charAt(password.length() - 1);
            if (!Character.isDigit(last)) {
                throw new IllegalArgumentException(
                    "Last character '" + last + "' is not a digit"
                );
            }
            System.out.println("✓ Check 5: Last character '" + last + "' is a digit");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Check 5: " + e.getMessage());
            allValid = false;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("❌ Check 5: Cannot access last character");
            allValid = false;
        }
        
        // Check 6: Contains special character
        try {
            boolean hasSpecial = false;
            char foundChar = ' ';
            
            for (char c : password.toCharArray()) {
                if (SPECIAL_CHARS.indexOf(c) != -1) {
                    hasSpecial = true;
                    foundChar = c;
                    break;
                }
            }
            
            if (!hasSpecial) {
                throw new IllegalArgumentException(
                    "No special character found. Allowed: " + SPECIAL_CHARS
                );
            }
            System.out.println("✓ Check 6: Contains special character '" + foundChar + "'");
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Check 6: " + e.getMessage());
            allValid = false;
        }
        
        return allValid;
    }
    
    /**
     * Display password rules
     */
    public static void displayRules() {
        System.out.println("\n========== PASSWORD RULES ==========");
        System.out.println("1. First character must be UPPERCASE letter (A-Z)");
        System.out.println("2. Last character must be a DIGIT (0-9)");
        System.out.println("3. Minimum length: " + MIN_LENGTH + " characters");
        System.out.println("4. Must contain at least ONE special character");
        System.out.println("   Allowed special characters: " + SPECIAL_CHARS);
        System.out.println("====================================\n");
    }
    
    /**
     * Main method to test password checker
     */
    public static void main(String[] args) {
        System.out.println("========== PASSWORD STRENGTH CHECKER ==========\n");
        
        displayRules();
        
        PasswordStrengthChecker checker = new PasswordStrengthChecker();
        
        // Test Case 1: Valid password
        System.out.println("\n\n--- TEST 1: VALID Password ---");
        System.out.println("Input: Password@123");
        boolean result = checker.checkPassword("Password@123");
        System.out.println("Result: " + (result ? "STRONG ✓" : "WEAK ✗"));
        
        // Test Case 2: Null password
        System.out.println("\n--- TEST 2: NULL Password ---");
        System.out.println("Input: null");
        result = checker.checkPassword(null);
        System.out.println("Result: " + (result ? "STRONG ✓" : "WEAK ✗"));
        
        // Test Case 3: Empty password
        System.out.println("\n--- TEST 3: EMPTY Password ---");
        System.out.println("Input: \"\" (empty string)");
        result = checker.checkPassword("");
        System.out.println("Result: " + (result ? "STRONG ✓" : "WEAK ✗"));
        
        // Test Case 4: Password shorter than 8 characters
        System.out.println("\n--- TEST 4: SHORT Password (< 8 chars) ---");
        System.out.println("Input: Pass@12");
        result = checker.checkPassword("Pass@12");
        System.out.println("Result: " + (result ? "STRONG ✓" : "WEAK ✗"));
        
        // Test Case 5: First character is lowercase
        System.out.println("\n--- TEST 5: Lowercase First Character ---");
        System.out.println("Input: password@123");
        result = checker.checkPassword("password@123");
        System.out.println("Result: " + (result ? "STRONG ✓" : "WEAK ✗"));
        
        // Test Case 6: Last character is not a digit
        System.out.println("\n--- TEST 6: Last Character Not Digit ---");
        System.out.println("Input: Password@abc");
        result = checker.checkPassword("Password@abc");
        System.out.println("Result: " + (result ? "STRONG ✓" : "WEAK ✗"));
        
        // Test Case 7: No special character
        System.out.println("\n--- TEST 7: No Special Character ---");
        System.out.println("Input: PasswordABC123");
        result = checker.checkPassword("PasswordABC123");
        System.out.println("Result: " + (result ? "STRONG ✓" : "WEAK ✗"));
        
        // Test Case 8: Another valid password
        System.out.println("\n--- TEST 8: Another VALID Password ---");
        System.out.println("Input: MySecure$Pass9");
        result = checker.checkPassword("MySecure$Pass9");
        System.out.println("Result: " + (result ? "STRONG ✓" : "WEAK ✗"));
        
        // Test Case 9: Detailed validation with valid password
        System.out.println("\n\n--- TEST 9: Detailed Validation (Valid) ---");
        checker.validatePasswordDetailed("Test#Password5");
        
        // Test Case 10: Detailed validation with invalid password
        System.out.println("\n--- TEST 10: Detailed Validation (Invalid - Multiple Errors) ---");
        checker.validatePasswordDetailed("weak1");
        
        // Interactive demonstration
        System.out.println("\n\n========== EXAMPLE VALID PASSWORDS ==========");
        String[] validPasswords = {
            "Strong@Pass1",
            "MySecret#12",
            "Welcome$2024",
            "Java&Program8"
        };
        
        System.out.println("These passwords meet all criteria:");
        for (String pwd : validPasswords) {
            System.out.println("\n  Input: " + pwd);
            checker.checkPassword(pwd);
        }
    }
}
