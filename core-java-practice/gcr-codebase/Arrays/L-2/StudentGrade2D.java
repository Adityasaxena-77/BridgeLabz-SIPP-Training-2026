import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {

            percentage[i] =
                    (marks[i][0] +
                     marks[i][1] +
                     marks[i][2]) / 3;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Student " + (i + 1));
            System.out.printf("Percentage = %.2f\n",
                    percentage[i]);
            System.out.println("Grade = " + grade[i]);
        }

        sc.close();
    }
}