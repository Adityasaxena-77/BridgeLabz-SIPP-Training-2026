import java.util.Scanner;

public class StudentScoreCard {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 10 + (int) (Math.random() * 91);
            scores[i][1] = 10 + (int) (Math.random() * 91);
            scores[i][2] = 10 + (int) (Math.random() * 91);
        }
        return scores;
    }

    public static double[][] calculateResult(int[][] scores) {
        double[][] result = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
            result[i][3] = scores[i][0];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateResult(scores);

        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < students; i++) {
            System.out.println("S" + (i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2]
                    + "\t" + result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "%");
        }
        scanner.close();
    }
}
