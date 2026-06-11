import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            do {
                System.out.print("Enter Weight (kg): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter Height (m): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);
        }

        for (int i = 0; i < n; i++) {

            personData[i][2] =
                    personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    status[i]);
        }

        sc.close();
    }
}
