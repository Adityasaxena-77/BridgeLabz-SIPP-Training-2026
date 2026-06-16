/**
 * Problem 5: Check Palindrome Using Recursion
 * Determine whether a string is palindrome using recursion.
 * 
 * Input: "madam"
 * Output: Palindrome
 * 
 * Input: "hello"
 * Output: Not a Palindrome
 */

public class CheckPalindromeRecursion {
    
    /**
     * Recursive function to check if a string is palindrome
     * Base case: if length is 0 or 1, it's a palindrome
     * Recursive case: first character equals last character AND middle is palindrome
     */
    public static boolean isPalindrome(String str) {
        // Base case: empty string or single character is palindrome
        if (str.length() <= 1) {
            return true;
        }
        
        // Check if first and last characters are equal
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        
        // Recursive case: check middle substring
        return isPalindrome(str.substring(1, str.length() - 1));
    }
    
    /**
     * Alternative approach using index pointers
     */
    public static boolean isPalindromeHelper(String str, int start, int end) {
        // Base case: start pointer crossed end pointer
        if (start >= end) {
            return true;
        }
        
        // Check if characters at start and end are equal
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Recursive case: move pointers towards center
        return isPalindromeHelper(str, start + 1, end - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 5: Check Palindrome Using Recursion\n");
        
        // Test case 1
        String str1 = "madam";
        System.out.println("Input: \"" + str1 + "\"");
        System.out.println("Output: " + (isPalindrome(str1) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Output (Method 2): " + (isPalindromeHelper(str1, 0, str1.length() - 1) ? "Palindrome" : "Not a Palindrome") + "\n");
        
        // Test case 2
        String str2 = "hello";
        System.out.println("Input: \"" + str2 + "\"");
        System.out.println("Output: " + (isPalindrome(str2) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Output (Method 2): " + (isPalindromeHelper(str2, 0, str2.length() - 1) ? "Palindrome" : "Not a Palindrome") + "\n");
        
        // Test case 3
        String str3 = "racecar";
        System.out.println("Input: \"" + str3 + "\"");
        System.out.println("Output: " + (isPalindrome(str3) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Output (Method 2): " + (isPalindromeHelper(str3, 0, str3.length() - 1) ? "Palindrome" : "Not a Palindrome") + "\n");
        
        // Test case 4
        String str4 = "A";
        System.out.println("Input: \"" + str4 + "\"");
        System.out.println("Output: " + (isPalindrome(str4) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Output (Method 2): " + (isPalindromeHelper(str4, 0, str4.length() - 1) ? "Palindrome" : "Not a Palindrome") + "\n");
        
        // Test case 5
        String str5 = "abba";
        System.out.println("Input: \"" + str5 + "\"");
        System.out.println("Output: " + (isPalindrome(str5) ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Output (Method 2): " + (isPalindromeHelper(str5, 0, str5.length() - 1) ? "Palindrome" : "Not a Palindrome"));
    }
}
