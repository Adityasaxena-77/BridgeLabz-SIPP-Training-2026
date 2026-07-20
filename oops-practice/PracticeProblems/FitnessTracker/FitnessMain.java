package FitnessTracker;

import java.util.Scanner;

public class FitnessMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessDevice device = new FitnessDevice(0, 0);
        while (true) {
            System.out.println("1. Log Activity");
            System.out.println("2. Generate Report");
            System.out.println("3. Check Goal Alerts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            if (!sc.hasNextInt()) {
                break;
            }
            int choice = sc.nextInt();
            if (choice == 4) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter steps taken: ");
                    if (!sc.hasNextInt()) {
                        break;
                    }
                    int steps = sc.nextInt();
                    System.out.print("Enter calories burned: ");
                    if (!sc.hasNextInt()) {
                        break;
                    }
                    int calories = sc.nextInt();
                    device.steps += steps;
                    device.calories += calories;
                    device.logActivity();
                    break;
                case 2:
                    device.generateReport();
                    break;
                case 3:
                    device.sendAlert();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
            System.out.println();
        }
        sc.close();
    }
}
