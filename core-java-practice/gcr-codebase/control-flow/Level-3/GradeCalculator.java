import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Maths: ");
        double maths = sc.nextDouble();

        double percentage = (physics + chemistry + maths) / 3;

        System.out.println("Percentage = " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade A");
            System.out.println("Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade B");
            System.out.println("Good");
        } else if (percentage >= 60) {
            System.out.println("Grade C");
            System.out.println("Average");
        } else if (percentage >= 40) {
            System.out.println("Grade D");
            System.out.println("Pass");
        } else {
            System.out.println("Grade F");
            System.out.println("Fail");
        }
    }
}