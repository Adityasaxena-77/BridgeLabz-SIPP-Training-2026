/**
 * Problem 3: Sum of First N Natural Numbers
 * Find the sum of first N natural numbers using recursion.
 * 
 * Input: N = 5
 * Output: 15
 * Explanation: 1 + 2 + 3 + 4 + 5 = 15
 */

public class SumOfFirstNNumbers {
    
    /**
     * Recursive function to calculate sum of first N natural numbers
     * Base case: sum(1) = 1
     * Recursive case: sum(n) = n + sum(n-1)
     */
    public static int sumOfNumbers(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        
        // Recursive case: n + sum(n-1)
        return n + sumOfNumbers(n - 1);
    }
    
    /**
     * Alternative approach using mathematical formula
     * Sum of first N natural numbers = N * (N + 1) / 2
     */
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 3: Sum of First N Natural Numbers\n");
        
        // Test case 1
        int n1 = 5;
        System.out.println("Input: N = " + n1);
        System.out.println("Output (Recursive): " + sumOfNumbers(n1));
        System.out.println("Output (Formula): " + sumUsingFormula(n1));
        System.out.println("Explanation: 1 + 2 + 3 + 4 + 5 = 15\n");
        
        // Test case 2
        int n2 = 10;
        System.out.println("Input: N = " + n2);
        System.out.println("Output (Recursive): " + sumOfNumbers(n2));
        System.out.println("Output (Formula): " + sumUsingFormula(n2));
        System.out.println("Explanation: Sum of 1 to 10 = 55\n");
        
        // Test case 3
        int n3 = 100;
        System.out.println("Input: N = " + n3);
        System.out.println("Output (Recursive): " + sumOfNumbers(n3));
        System.out.println("Output (Formula): " + sumUsingFormula(n3));
        System.out.println("Explanation: Sum of 1 to 100 = 5050");
    }
}
