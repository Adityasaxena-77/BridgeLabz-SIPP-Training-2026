/**
 * Online Quiz Application
 * Scenario: Handle exceptions when comparing answers from array
 * 
 * Student answers: String answers[] = {"A","B","C","D"};
 * Issue: Program compares answers[5].equals("A") - OUT OF BOUNDS!
 * 
 * Task:
 * - Identify possible exceptions
 * - Handle them appropriately
 * - Continue checking remaining answers
 */

public class OnlineQuizApplication {
    
    private String[] correctAnswers = {"A", "B", "C", "D", "B"};
    private String[] studentAnswers;
    private int[] questionNumbers = {1, 2, 3, 4, 5};
    
    /**
     * Constructor to initialize quiz with student answers
     */
    public OnlineQuizApplication(String[] answers) {
        this.studentAnswers = answers;
    }
    
    /**
     * Check answer at specific position
     * Handles array out of bounds exception gracefully
     * 
     * @param questionIndex - Index of the question
     * @return true if correct, false if incorrect or error
     */
    public boolean checkAnswer(int questionIndex) {
        try {
            // Check if index is valid for correct answers
            if (questionIndex < 0 || questionIndex >= correctAnswers.length) {
                throw new ArrayIndexOutOfBoundsException(
                    " Question index out of bounds: " + questionIndex + 
                    ". Valid range: 0 to " + (correctAnswers.length - 1)
                );
            }
            
            // Check if index is valid for student answers
            if (questionIndex >= studentAnswers.length) {
                throw new ArrayIndexOutOfBoundsException(
                    "⚠ Question " + (questionIndex + 1) + " was not answered by student"
                );
            }
            
            // Handle null answer
            if (studentAnswers[questionIndex] == null) {
                System.out.println("Question " + (questionIndex + 1) + ": ✗ No answer provided (null)");
                return false;
            }
            
            // Compare answers
            boolean isCorrect = studentAnswers[questionIndex].equals(correctAnswers[questionIndex]);
            
            if (isCorrect) {
                System.out.println("Question " + (questionIndex + 1) + ": ✓ Correct! Answer: " + 
                                 studentAnswers[questionIndex]);
            } else {
                System.out.println("Question " + (questionIndex + 1) + ": ✗ Wrong! Your: " + 
                                 studentAnswers[questionIndex] + ", Correct: " + 
                                 correctAnswers[questionIndex]);
            }
            
            return isCorrect;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (NullPointerException e) {
            System.out.println("Question " + (questionIndex + 1) + ": Null pointer exception");
            return false;
        }
    }
    
    /**
     * Check all answers and continue even if some fail
     * Demonstrates exception handling with continuation
     * 
     * @return Score out of total questions
     */
    public int evaluateAllAnswers() {
        System.out.println("\n--- Evaluating All Answers ---\n");
        
        int score = 0;
        int answeredCount = 0;
        
        // Check all correct answers (we know this range is safe)
        for (int i = 0; i < correctAnswers.length; i++) {
            try {
                answeredCount++;
                
                // Check if student answered this question
                if (i >= studentAnswers.length) {
                    System.out.println("Question " + (i + 1) + ": ⚠ Not answered");
                    continue; // Continue to next question
                }
                
                // Handle null answer
                if (studentAnswers[i] == null) {
                    System.out.println("Question " + (i + 1) + ": ✗ No answer (null)");
                    continue; // Continue to next question
                }
                
                // Check answer
                if (studentAnswers[i].equals(correctAnswers[i])) {
                    System.out.println("Question " + (i + 1) + ": ✓ Correct!");
                    score++;
                } else {
                    System.out.println("Question " + (i + 1) + ": ✗ Incorrect. " +
                                     "Your: " + studentAnswers[i] + ", Correct: " + 
                                     correctAnswers[i]);
                }
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Question " + (i + 1) + ": Index error - " + e.getMessage());
                // Continue to next question despite error
                continue;
            } catch (NullPointerException e) {
                System.out.println("Question " + (i + 1) + ": Null pointer error");
                continue;
            } catch (Exception e) {
                System.out.println("Question " + (i + 1) + ": Unexpected error - " + e.getMessage());
                continue;
            }
        }
        
        // Display results
        System.out.println("\n--- Quiz Results ---");
        System.out.println("Total Questions: " + correctAnswers.length);
        System.out.println("Answered: " + Math.min(studentAnswers.length, correctAnswers.length));
        System.out.println("Score: " + score + "/" + correctAnswers.length);
        System.out.println("Percentage: " + (score * 100 / correctAnswers.length) + "%");
        
        return score;
    }
    
    /**
     * Safe answer checking with detailed error handling
     */
    public void safeCheckAnswer(int questionIndex) {
        System.out.println("\n--- Checking Question " + (questionIndex + 1) + " ---");
        
        try {
            // Validate index range
            if (questionIndex < 0) {
                throw new IllegalArgumentException(
                    " Question index cannot be negative: " + questionIndex
                );
            }
            
            if (questionIndex >= correctAnswers.length) {
                throw new ArrayIndexOutOfBoundsException(
                    " Question " + (questionIndex + 1) + " does not exist. " +
                    "Quiz has only " + correctAnswers.length + " questions."
                );
            }
            
            // Check if student answered
            if (questionIndex >= studentAnswers.length) {
                System.out.println("⚠ Question " + (questionIndex + 1) + " was not answered.");
                System.out.println("   Correct answer was: " + correctAnswers[questionIndex]);
                return;
            }
            
            // Get student answer
            String studentAnswer = studentAnswers[questionIndex];
            
            if (studentAnswer == null) {
                System.out.println("⚠ Student provided null answer for Question " + (questionIndex + 1));
                System.out.println("   Correct answer is: " + correctAnswers[questionIndex]);
                return;
            }
            
            // Compare
            String correctAnswer = correctAnswers[questionIndex];
            
            if (studentAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("✓ CORRECT! Answer: " + studentAnswer);
            } else {
                System.out.println("✗ INCORRECT!");
                System.out.println("   Your answer: " + studentAnswer);
                System.out.println("   Correct answer: " + correctAnswer);
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
    /**
     * Main method to test the quiz
     */
    public static void main(String[] args) {
        System.out.println("========== ONLINE QUIZ APPLICATION ==========\n");
        System.out.println("Correct Answers: A, B, C, D, B\n");
        
        // Test Case 1: Student with all answers correct
        System.out.println("--- TEST 1: Student with Correct Answers ---");
        String[] answers1 = {"A", "B", "C", "D", "B"};
        OnlineQuizApplication quiz1 = new OnlineQuizApplication(answers1);
        quiz1.evaluateAllAnswers();
        
        // Test Case 2: Student with some wrong answers
        System.out.println("\n\n--- TEST 2: Student with Some Wrong Answers ---");
        String[] answers2 = {"A", "A", "C", "B", "B"};
        OnlineQuizApplication quiz2 = new OnlineQuizApplication(answers2);
        quiz2.evaluateAllAnswers();
        
        // Test Case 3: Student with fewer answers (unanswered questions)
        System.out.println("\n\n--- TEST 3: Student with Unanswered Questions ---");
        String[] answers3 = {"A", "B", "C"}; // Only 3 answers for 5 questions
        OnlineQuizApplication quiz3 = new OnlineQuizApplication(answers3);
        quiz3.evaluateAllAnswers();
        
        // Test Case 4: Student with null answers
        System.out.println("\n\n--- TEST 4: Student with Null Answers ---");
        String[] answers4 = {"A", null, "C", "D", "B"};
        OnlineQuizApplication quiz4 = new OnlineQuizApplication(answers4);
        quiz4.evaluateAllAnswers();
        
        // Test Case 5: Check specific answer with valid index
        System.out.println("\n\n--- TEST 5: Check Specific Question (Index 1) ---");
        OnlineQuizApplication quiz5 = new OnlineQuizApplication(new String[]{"A", "B", "C", "D", "B"});
        quiz5.safeCheckAnswer(1);
        
        // Test Case 6: Check specific answer with INVALID INDEX (out of bounds)
        System.out.println("\n--- TEST 6: Check Invalid Question (Index 8) ---");
        quiz5.safeCheckAnswer(8);
        
        // Test Case 7: Check specific answer with NEGATIVE INDEX
        System.out.println("\n--- TEST 7: Check Negative Index Question (-1) ---");
        quiz5.safeCheckAnswer(-1);
        
        // Test Case 8: Check answer where student didn't answer
        System.out.println("\n--- TEST 8: Check Question Student Didn't Answer ---");
        OnlineQuizApplication quiz6 = new OnlineQuizApplication(new String[]{"A", "B"});
        quiz6.safeCheckAnswer(3);
    }
}
