/**
 * Problem 1: Print Numbers from N to 1
 * Write a recursive function to print numbers from N to 1.
 * 
 * Input: N = 5
 * Output: 5 4 3 2 1
 */

public class PrintNumbersNTo1 {
    
    /**
     * Recursive function to print numbers from N to 1
     * Base case: When n becomes 0, stop recursion
     * Recursive case: Print current number and call recursively with n-1
     */
    public static void printNumbers(int n) {
        // Base case: when n is 0, stop recursion
        if (n == 0) {
            return;
        }
        
        // Print current number
        System.out.print(n + " ");
        
        // Recursive call with n-1
        printNumbers(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 1: Print Numbers from N to 1\n");
        
        // Test case 1
        System.out.println("Input: N = 5");
        System.out.print("Output: ");
        printNumbers(5);
        System.out.println("\n");
        
        // Test case 2
        System.out.println("Input: N = 8");
        System.out.print("Output: ");
        printNumbers(8);
        System.out.println("\n");
        
        // Test case 3
        System.out.println("Input: N = 3");
        System.out.print("Output: ");
        printNumbers(3);
        System.out.println();
    }
}
