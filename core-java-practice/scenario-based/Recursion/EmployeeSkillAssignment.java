/**
 * Problem 13: Employee Skill Assignment
 * An employee can work on multiple projects.
 * Given an array of employee skill scores, find all possible project teams
 * whose total skill score equals a target value.
 * 
 * This is a variant of the Subset Sum problem using recursion.
 * 
 * Input: skillScores = [1, 2, 3, 4], targetScore = 6
 * Output: 
 *   Team: [2, 4]
 *   Team: [1, 2, 3]
 * 
 * Input: skillScores = [5, 10, 15], targetScore = 20
 * Output:
 *   Team: [5, 15]
 */

import java.util.*;

public class EmployeeSkillAssignment {
    
    /**
     * Recursive function to find all teams with target skill score
     * Uses backtracking approach
     */
    public static void findTeams(int[] skills, int index, int currentSum, 
                                 int targetSum, List<Integer> currentTeam, 
                                 List<List<Integer>> result) {
        // Base case 1: if current sum equals target, add team to result
        if (currentSum == targetSum) {
            result.add(new ArrayList<>(currentTeam));
            return;
        }
        
        // Base case 2: if current sum exceeds target or reached end, stop
        if (currentSum > targetSum || index == skills.length) {
            return;
        }
        
        // Include current skill in team
        currentTeam.add(skills[index]);
        findTeams(skills, index + 1, currentSum + skills[index], targetSum, currentTeam, result);
        
        // Exclude current skill from team (backtrack)
        currentTeam.remove(currentTeam.size() - 1);
        
        // Move to next skill without including current one
        findTeams(skills, index + 1, currentSum, targetSum, currentTeam, result);
    }
    
    /**
     * Wrapper method to find all possible teams with target score
     */
    public static List<List<Integer>> getTeamsWithTargetScore(int[] skills, int targetScore) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (skills == null || skills.length == 0) {
            return result;
        }
        
        findTeams(skills, 0, 0, targetScore, new ArrayList<>(), result);
        return result;
    }
    
    /**
     * Find all teams and also count how many ways to form teams
     */
    public static int countTeams(int[] skills, int index, int currentSum, int targetSum) {
        // Base case: if current sum equals target, we found one way
        if (currentSum == targetSum) {
            return 1;
        }
        
        // Base case: if current sum exceeds target or reached end, return 0
        if (currentSum > targetSum || index == skills.length) {
            return 0;
        }
        
        // Include current skill
        int includeCount = countTeams(skills, index + 1, currentSum + skills[index], targetSum);
        
        // Exclude current skill
        int excludeCount = countTeams(skills, index + 1, currentSum, targetSum);
        
        return includeCount + excludeCount;
    }
    
    /**
     * Print teams in readable format
     */
    public static void printTeams(List<List<Integer>> teams) {
        if (teams.isEmpty()) {
            System.out.println("No teams found with target score.");
            return;
        }
        
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("  Team " + (i + 1) + ": " + teams.get(i));
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Problem 13: Employee Skill Assignment - Find Teams with Target Score\n");
        
        // Test case 1: skillScores = [1, 2, 3, 4], targetScore = 6
        int[] skills1 = {1, 2, 3, 4};
        int target1 = 6;
        System.out.println("Input: skillScores = [1, 2, 3, 4], targetScore = " + target1);
        List<List<Integer>> teams1 = getTeamsWithTargetScore(skills1, target1);
        System.out.println("Output:");
        printTeams(teams1);
        System.out.println("Total teams: " + teams1.size());
        System.out.println("Total ways (count): " + countTeams(skills1, 0, 0, target1) + "\n");
        
        // Test case 2: skillScores = [5, 10, 15], targetScore = 20
        int[] skills2 = {5, 10, 15};
        int target2 = 20;
        System.out.println("Input: skillScores = [5, 10, 15], targetScore = " + target2);
        List<List<Integer>> teams2 = getTeamsWithTargetScore(skills2, target2);
        System.out.println("Output:");
        printTeams(teams2);
        System.out.println("Total teams: " + teams2.size());
        System.out.println("Total ways (count): " + countTeams(skills2, 0, 0, target2) + "\n");
        
        // Test case 3: skillScores = [2, 3, 4, 5], targetScore = 7
        int[] skills3 = {2, 3, 4, 5};
        int target3 = 7;
        System.out.println("Input: skillScores = [2, 3, 4, 5], targetScore = " + target3);
        List<List<Integer>> teams3 = getTeamsWithTargetScore(skills3, target3);
        System.out.println("Output:");
        printTeams(teams3);
        System.out.println("Total teams: " + teams3.size());
        System.out.println("Total ways (count): " + countTeams(skills3, 0, 0, target3) + "\n");
        
        // Test case 4: skillScores = [1, 1, 1, 1], targetScore = 3
        int[] skills4 = {1, 1, 1, 1};
        int target4 = 3;
        System.out.println("Input: skillScores = [1, 1, 1, 1], targetScore = " + target4);
        List<List<Integer>> teams4 = getTeamsWithTargetScore(skills4, target4);
        System.out.println("Output:");
        printTeams(teams4);
        System.out.println("Total teams: " + teams4.size());
        System.out.println("Total ways (count): " + countTeams(skills4, 0, 0, target4) + "\n");
        
        // Test case 5: skillScores = [10, 20, 30], targetScore = 50
        int[] skills5 = {10, 20, 30};
        int target5 = 50;
        System.out.println("Input: skillScores = [10, 20, 30], targetScore = " + target5);
        List<List<Integer>> teams5 = getTeamsWithTargetScore(skills5, target5);
        System.out.println("Output:");
        printTeams(teams5);
        System.out.println("Total teams: " + teams5.size());
        System.out.println("Total ways (count): " + countTeams(skills5, 0, 0, target5) + "\n");
        
        // Test case 6: No possible teams
        int[] skills6 = {5, 10};
        int target6 = 20;
        System.out.println("Input: skillScores = [5, 10], targetScore = " + target6);
        List<List<Integer>> teams6 = getTeamsWithTargetScore(skills6, target6);
        System.out.println("Output:");
        printTeams(teams6);
        System.out.println("Total teams: " + teams6.size());
        System.out.println("Total ways (count): " + countTeams(skills6, 0, 0, target6));
    }
}
