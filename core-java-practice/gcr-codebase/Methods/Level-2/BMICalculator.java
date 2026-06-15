import java.util.Scanner;

public class BMICalculator {
    public static double[][] calculateBMI(double[][] persons) {
        for (int i = 0; i < persons.length; i++) {
            double weight = persons[i][0];
            double heightInCm = persons[i][1];
            double heightInMeters = heightInCm / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            persons[i][2] = bmi;
        }
        return persons;
    }

    public static String[] getStatus(double[][] persons) {
        String[] status = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            double bmi = persons[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = scanner.nextDouble();
        }

        calculateBMI(persons);
        String[] status = getStatus(persons);

        for (int i = 0; i < persons.length; i++) {
            System.out.println("Person " + (i + 1) + " -> Weight: " + persons[i][0]
                    + " kg, Height: " + persons[i][1] + " cm, BMI: " + persons[i][2] + ", Status: " + status[i]);
        }

        scanner.close();
    }
}
