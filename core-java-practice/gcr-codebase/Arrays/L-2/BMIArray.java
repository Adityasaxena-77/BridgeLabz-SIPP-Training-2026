import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter Height (m): ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 25)
                status[i] = "Normal";
            else if (bmi[i] < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    weight[i], height[i], bmi[i], status[i]);
        }

        sc.close();
    }
}