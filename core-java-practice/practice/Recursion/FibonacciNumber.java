/**
 * Problem 6: Find nth Fibonacci Number
 * Return the nth Fibonacci number using recursion.
 * 
 * Input: 6
 * Output: 8
 * Sequence: 1, 1, 2, 3, 5, 8, 13, 21...
 * (6th Fibonacci number is 8)
 */

public class FibonacciNumber {
    
    /**
     * Simple recursive approach to find nth Fibonacci number
     * Base cases: fib(1) = 1, fib(2) = 1
     * Recursive case: fib(n) = fib(n-1) + fib(n-2)
     * Note: This approach is slow for large n due to repeated calculations
     */
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        
        // Recursive case: fib(n) = fib(n-1) + fib(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    /**
     * Optimized recursive approach using memoization
     * This prevents recalculation of same values
     */
    public static int fibonacciMemo(int n, java.util.HashMap<Integer, Integer> memo) {
        // Base cases
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        
        // Check if already calculated
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        // Calculate and store in memo
        int result = fibonacciMemo(n - 1, memo) + fibonacciMemo(n - 2, memo);
        memo.put(n, result);
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 6: Find nth Fibonacci Number\n");
        
        // Test case 1
        int n1 = 6;
        System.out.println("Input: " + n1);
        System.out.println("Output: " + fibonacci(n1));
        System.out.println("Sequence: 1, 1, 2, 3, 5, 8");
        System.out.println("(6th Fibonacci number is 8)\n");
        
        // Test case 2
        int n2 = 1;
        System.out.println("Input: " + n2);
        System.out.println("Output: " + fibonacci(n2));
        System.out.println("(1st Fibonacci number is 1)\n");
        
        // Test case 3
        int n3 = 5;
        System.out.println("Input: " + n3);
        System.out.println("Output: " + fibonacci(n3));
        System.out.println("Sequence: 1, 1, 2, 3, 5");
        System.out.println("(5th Fibonacci number is 5)\n");
        
        // Test case 4 - Using Memoization for larger numbers
        int n4 = 10;
        java.util.HashMap<Integer, Integer> memo = new java.util.HashMap<>();
        System.out.println("Input: " + n4 + " (using memoization)");
        System.out.println("Output: " + fibonacciMemo(n4, memo));
        System.out.println("(10th Fibonacci number is 55)\n");
        
        // Test case 5 - Using Memoization
        int n5 = 15;
        memo.clear();
        System.out.println("Input: " + n5 + " (using memoization)");
        System.out.println("Output: " + fibonacciMemo(n5, memo));
        System.out.println("(15th Fibonacci number is 610)");
    }
}
