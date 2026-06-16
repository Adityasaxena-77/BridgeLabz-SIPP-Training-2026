/**
 * Problem 2: Calculate Factorial
 * Write a recursive function to calculate the factorial of a number.
 * 
 * Input: 5
 * Output: 120
 * Explanation: 5! = 5 × 4 × 3 × 2 × 1 = 120
 */

public class CalculateFactorial {
    
    /**
     * Recursive function to calculate factorial
     * Base case: factorial(0) = 1 and factorial(1) = 1
     * Recursive case: factorial(n) = n * factorial(n-1)
     */
    public static long factorial(int n) {
        // Base cases
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Recursive case: n * factorial(n-1)
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 2: Calculate Factorial\n");
        
        // Test case 1
        int num1 = 5;
        System.out.println("Input: " + num1);
        System.out.println("Output: " + factorial(num1));
        System.out.println("Explanation: 5! = 5 × 4 × 3 × 2 × 1 = 120\n");
        
        // Test case 2
        int num2 = 0;
        System.out.println("Input: " + num2);
        System.out.println("Output: " + factorial(num2));
        System.out.println("Explanation: 0! = 1 (by definition)\n");
        
        // Test case 3
        int num3 = 6;
        System.out.println("Input: " + num3);
        System.out.println("Output: " + factorial(num3));
        System.out.println("Explanation: 6! = 6 × 5 × 4 × 3 × 2 × 1 = 720\n");
        
        // Test case 4
        int num4 = 10;
        System.out.println("Input: " + num4);
        System.out.println("Output: " + factorial(num4));
        System.out.println("Explanation: 10! = 3,628,800");
    }
}
