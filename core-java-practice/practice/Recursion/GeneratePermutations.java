/**
 * Problem 10: Generate All Permutations of a String
 * Generate all possible permutations of a string recursively.
 * 
 * Input: "ABC"
 * Output: ABC, ACB, BAC, BCA, CAB, CBA
 */

import java.util.*;

public class GeneratePermutations {
    
    /**
     * Recursive function to generate all permutations
     * Uses backtracking approach
     */
    public static void generatePermutations(String str, int start, int end, 
                                           List<String> result) {
        // Base case: reached end of string, add permutation to result
        if (start == end) {
            result.add(str);
            return;
        }
        
        // Convert string to char array for swapping
        char[] chars = str.toCharArray();
        
        // Generate permutations by swapping characters
        for (int i = start; i <= end; i++) {
            // Swap character at start with character at i
            char temp = chars[start];
            chars[start] = chars[i];
            chars[i] = temp;
            
            // Recursively generate permutations for remaining string
            generatePermutations(String.valueOf(chars), start + 1, end, result);
            
            // Backtrack: swap back to original positions
            temp = chars[start];
            chars[start] = chars[i];
            chars[i] = temp;
        }
    }
    
    /**
     * Wrapper method to generate all permutations
     */
    public static List<String> getPermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }
        generatePermutations(str, 0, str.length() - 1, result);
        return result;
    }
    
    /**
     * Alternative approach using recursion with list operations
     */
    public static List<String> permuteAlternative(String str) {
        List<String> result = new ArrayList<>();
        
        // Base case: single character
        if (str.length() <= 1) {
            result.add(str);
            return result;
        }
        
        // For each character, generate permutations of remaining characters
        for (int i = 0; i < str.length(); i++) {
            // Get current character
            char current = str.charAt(i);
            
            // Get remaining characters
            String remaining = str.substring(0, i) + str.substring(i + 1);
            
            // Get permutations of remaining characters
            List<String> perms = permuteAlternative(remaining);
            
            // Add current character to each permutation
            for (String perm : perms) {
                result.add(current + perm);
            }
        }
        
        return result;
    }
    
    /**
     * Print permutations in readable format
     */
    public static void printPermutations(List<String> permutations) {
        for (int i = 0; i < permutations.size(); i++) {
            System.out.print(permutations.get(i));
            if (i < permutations.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 10: Generate All Permutations of a String\n");
        
        // Test case 1
        String str1 = "ABC";
        System.out.println("Input: \"" + str1 + "\"");
        System.out.print("Output (Method 1): ");
        List<String> result1 = getPermutations(str1);
        printPermutations(result1);
        System.out.print("Output (Method 2): ");
        List<String> result1Alt = permuteAlternative(str1);
        printPermutations(result1Alt);
        System.out.println("Count: " + result1.size() + " permutations (3! = 6)\n");
        
        // Test case 2
        String str2 = "AB";
        System.out.println("Input: \"" + str2 + "\"");
        System.out.print("Output (Method 1): ");
        List<String> result2 = getPermutations(str2);
        printPermutations(result2);
        System.out.print("Output (Method 2): ");
        List<String> result2Alt = permuteAlternative(str2);
        printPermutations(result2Alt);
        System.out.println("Count: " + result2.size() + " permutations (2! = 2)\n");
        
        // Test case 3
        String str3 = "A";
        System.out.println("Input: \"" + str3 + "\"");
        System.out.print("Output (Method 1): ");
        List<String> result3 = getPermutations(str3);
        printPermutations(result3);
        System.out.print("Output (Method 2): ");
        List<String> result3Alt = permuteAlternative(str3);
        printPermutations(result3Alt);
        System.out.println("Count: " + result3.size() + " permutation (1! = 1)\n");
        
        // Test case 4
        String str4 = "ABCD";
        System.out.println("Input: \"" + str4 + "\"");
        System.out.print("Output (Method 1): ");
        List<String> result4 = getPermutations(str4);
        printPermutations(result4);
        System.out.println("Count: " + result4.size() + " permutations (4! = 24)");
    }
}
