/**
 * Problem 7: Calculate Power(x,n)
 * Compute x^n using recursion.
 * 
 * Input: x = 2, n = 5
 * Output: 32
 * Explanation: 2^5 = 2 × 2 × 2 × 2 × 2 = 32
 */

public class CalculatePower {
    
    /**
     * Simple recursive approach to calculate power
     * Base case: x^0 = 1
     * Recursive case: x^n = x * x^(n-1)
     */
    public static long power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        
        // Base case for negative power
        if (n < 0) {
            return 1 / (x * power(x, -n - 1));
        }
        
        // Recursive case: x^n = x * x^(n-1)
        return x * power(x, n - 1);
    }
    
    /**
     * Optimized recursive approach using divide and conquer
     * Time complexity: O(log n) instead of O(n)
     * x^n = (x^(n/2))^2 if n is even
     * x^n = x * x^(n-1) if n is odd
     */
    public static long powerOptimized(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        
        // Base case for negative power
        if (n < 0) {
            return powerOptimized(x, -n - 1) == 0 ? 0 : 1 / (x * powerOptimized(x, -n - 1));
        }
        
        // Calculate power for n/2
        long half = powerOptimized(x, n / 2);
        
        // If n is even: x^n = (x^(n/2))^2
        if (n % 2 == 0) {
            return half * half;
        }
        // If n is odd: x^n = x * (x^((n-1)/2))^2
        else {
            return x * half * half;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 7: Calculate Power(x,n)\n");
        
        // Test case 1
        int x1 = 2, n1 = 5;
        System.out.println("Input: x = " + x1 + ", n = " + n1);
        System.out.println("Output (Simple): " + power(x1, n1));
        System.out.println("Output (Optimized): " + powerOptimized(x1, n1));
        System.out.println("Explanation: 2^5 = 2 × 2 × 2 × 2 × 2 = 32\n");
        
        // Test case 2
        int x2 = 3, n2 = 4;
        System.out.println("Input: x = " + x2 + ", n = " + n2);
        System.out.println("Output (Simple): " + power(x2, n2));
        System.out.println("Output (Optimized): " + powerOptimized(x2, n2));
        System.out.println("Explanation: 3^4 = 3 × 3 × 3 × 3 = 81\n");
        
        // Test case 3
        int x3 = 5, n3 = 0;
        System.out.println("Input: x = " + x3 + ", n = " + n3);
        System.out.println("Output (Simple): " + power(x3, n3));
        System.out.println("Output (Optimized): " + powerOptimized(x3, n3));
        System.out.println("Explanation: Any number to power 0 = 1\n");
        
        // Test case 4
        int x4 = 10, n4 = 3;
        System.out.println("Input: x = " + x4 + ", n = " + n4);
        System.out.println("Output (Simple): " + power(x4, n4));
        System.out.println("Output (Optimized): " + powerOptimized(x4, n4));
        System.out.println("Explanation: 10^3 = 1000\n");
        
        // Test case 5
        int x5 = 2, n5 = 10;
        System.out.println("Input: x = " + x5 + ", n = " + n5);
        System.out.println("Output (Simple): " + power(x5, n5));
        System.out.println("Output (Optimized): " + powerOptimized(x5, n5));
        System.out.println("Explanation: 2^10 = 1024");
    }
}
