/**
 * Problem 9: Solve Tower of Hanoi
 * Print all steps required to move N disks from Source to Destination.
 * 
 * Rules:
 * 1. Only one disk can be moved at a time
 * 2. A larger disk cannot be placed on a smaller disk
 * 3. All disks must be moved from Source to Destination using Auxiliary rod
 * 
 * Input: N = 3
 * Output: Step-by-step moves showing how to transfer disks
 */

public class TowerOfHanoi {
    
    /**
     * Recursive function to solve Tower of Hanoi problem
     * 
     * Algorithm:
     * 1. Move n-1 disks from source to auxiliary using destination
     * 2. Move the largest disk from source to destination
     * 3. Move n-1 disks from auxiliary to destination using source
     */
    public static int moveCount = 0;
    
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: only one disk, move directly
        if (n == 1) {
            moveCount++;
            System.out.println("Step " + moveCount + ": Move disk 1 from " + source + " to " + destination);
            return;
        }
        
        // Move n-1 disks from source to auxiliary using destination
        solveHanoi(n - 1, source, auxiliary, destination);
        
        // Move the largest (nth) disk from source to destination
        moveCount++;
        System.out.println("Step " + moveCount + ": Move disk " + n + " from " + source + " to " + destination);
        
        // Move n-1 disks from auxiliary to destination using source
        solveHanoi(n - 1, auxiliary, destination, source);
    }
    
    /**
     * Wrapper method to solve Tower of Hanoi
     */
    public static void hanoiSolver(int n) {
        moveCount = 0;
        solveHanoi(n, 'A', 'C', 'B');
        System.out.println("Total moves required: " + moveCount + " (Formula: 2^n - 1 = " + (int)(Math.pow(2, n) - 1) + ")\n");
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 9: Solve Tower of Hanoi\n");
        
        // Test case 1: N = 2
        System.out.println("Input: N = 2");
        System.out.println("(Move 2 disks from A to C using B)\n");
        hanoiSolver(2);
        
        // Test case 2: N = 3
        System.out.println("Input: N = 3");
        System.out.println("(Move 3 disks from A to C using B)\n");
        hanoiSolver(3);
        
        // Test case 3: N = 4
        System.out.println("Input: N = 4");
        System.out.println("(Move 4 disks from A to C using B)\n");
        hanoiSolver(4);
    }
}
