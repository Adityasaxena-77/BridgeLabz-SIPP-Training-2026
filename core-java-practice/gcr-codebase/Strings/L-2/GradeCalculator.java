import java.util.Scanner;

public class GradeCalculator {

    public static String grade(double percentage) {

        if (percentage >= 90)
            return "A+";

        else if (percentage >= 80)
            return "A";

        else if (percentage >= 70)
            return "B";

        else if (percentage >= 60)
            return "C";

        else if (percentage >= 50)
            return "D";

        return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number of Students: ");

        int n = sc.nextInt();

        System.out.println(
                "\nPhy\tChem\tMath\tTotal\t%\tGrade");

        for (int i = 1; i <= n; i++) {

            int phy = (int) (Math.random() * 100);
            int chem = (int) (Math.random() * 100);
            int math = (int) (Math.random() * 100);

            int total = phy + chem + math;

            double percentage =
                    Math.round((total / 3.0) * 100.0) / 100.0;

            System.out.println(
                    phy + "\t" + chem + "\t" + math +
                            "\t" + total + "\t" +
                            percentage + "\t" +
                            grade(percentage));
        }
    }
}