import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Expense Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        FileWriter fw = new FileWriter("expenses.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(category + " - " + amount);
        bw.newLine();

        bw.close();
        sc.close();

        System.out.println("Expense saved successfully.");
    }
}