/**
 * Problem 8: Generate All Subsets of an Array
 * Given an array, generate all possible subsets recursively.
 * 
 * Input: [1, 2]
 * Output: [], [1], [2], [1, 2]
 */

import java.util.*;

public class GenerateSubsets {
    
    /**
     * Recursive function to generate all subsets
     * Uses backtracking approach
     */
    public static void generateSubsets(int[] arr, int index, List<Integer> current, 
                                       List<List<Integer>> result) {
        // Base case: reached end of array, add current subset to result
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Exclude current element and recursively generate subsets
        generateSubsets(arr, index + 1, current, result);
        
        // Include current element and recursively generate subsets
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current, result);
        
        // Backtrack: remove current element
        current.remove(current.size() - 1);
    }
    
    /**
     * Wrapper method to generate all subsets
     */
    public static List<List<Integer>> getSubsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(arr, 0, new ArrayList<>(), result);
        return result;
    }
    
    /**
     * Print all subsets in readable format
     */
    public static void printSubsets(List<List<Integer>> subsets) {
        for (List<Integer> subset : subsets) {
            if (subset.isEmpty()) {
                System.out.print("[]");
            } else {
                System.out.print(subset);
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 8: Generate All Subsets of an Array\n");
        
        // Test case 1
        int[] arr1 = {1, 2};
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.print("Output: ");
        List<List<Integer>> result1 = getSubsets(arr1);
        printSubsets(result1);
        System.out.println("Count: " + result1.size() + " subsets\n");
        
        // Test case 2
        int[] arr2 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.print("Output: ");
        List<List<Integer>> result2 = getSubsets(arr2);
        printSubsets(result2);
        System.out.println("Count: " + result2.size() + " subsets\n");
        
        // Test case 3
        int[] arr3 = {5};
        System.out.println("Input: " + Arrays.toString(arr3));
        System.out.print("Output: ");
        List<List<Integer>> result3 = getSubsets(arr3);
        printSubsets(result3);
        System.out.println("Count: " + result3.size() + " subsets\n");
        
        // Test case 4
        int[] arr4 = {1, 2, 3, 4};
        System.out.println("Input: " + Arrays.toString(arr4));
        System.out.print("Output: ");
        List<List<Integer>> result4 = getSubsets(arr4);
        printSubsets(result4);
        System.out.println("Count: " + result4.size() + " subsets (2^4 = 16)");
    }
}
