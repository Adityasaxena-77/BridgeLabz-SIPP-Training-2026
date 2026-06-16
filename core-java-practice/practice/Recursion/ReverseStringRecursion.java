/**
 * Problem 4: Reverse a String Using Recursion
 * Write a recursive function to reverse a given string.
 * 
 * Input: "hello"
 * Output: "olleh"
 */

public class ReverseStringRecursion {
    
    /**
     * Recursive function to reverse a string
     * Base case: empty string or single character returns itself
     * Recursive case: reverse of last character + reverse of remaining string
     */
    public static String reverseString(String str) {
        // Base case: empty string or single character
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
        // Recursive case: last character + reverse of remaining string
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    
    /**
     * Alternative recursive approach using index
     */
    public static String reverseStringHelper(String str, int index) {
        // Base case: reached the end
        if (index < 0) {
            return "";
        }
        
        // Recursive case: character at index + reverse of remaining string
        return reverseStringHelper(str, index - 1) + str.charAt(index);
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 4: Reverse a String Using Recursion\n");
        
        // Test case 1
        String str1 = "hello";
        System.out.println("Input: \"" + str1 + "\"");
        System.out.println("Output (Method 1): \"" + reverseString(str1) + "\"");
        System.out.println("Output (Method 2): \"" + reverseStringHelper(str1, str1.length() - 1) + "\"\n");
        
        // Test case 2
        String str2 = "ABCDEF";
        System.out.println("Input: \"" + str2 + "\"");
        System.out.println("Output (Method 1): \"" + reverseString(str2) + "\"");
        System.out.println("Output (Method 2): \"" + reverseStringHelper(str2, str2.length() - 1) + "\"\n");
        
        // Test case 3
        String str3 = "Java";
        System.out.println("Input: \"" + str3 + "\"");
        System.out.println("Output (Method 1): \"" + reverseString(str3) + "\"");
        System.out.println("Output (Method 2): \"" + reverseStringHelper(str3, str3.length() - 1) + "\"\n");
        
        // Test case 4
        String str4 = "a";
        System.out.println("Input: \"" + str4 + "\"");
        System.out.println("Output (Method 1): \"" + reverseString(str4) + "\"");
        System.out.println("Output (Method 2): \"" + reverseStringHelper(str4, str4.length() - 1) + "\"");
    }
}
