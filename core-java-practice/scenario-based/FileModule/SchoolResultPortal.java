import java.io.*;
import java.util.Scanner;

public class SchoolResultPortal {
    public static void main(String[] args) {

        try {
            File file = new File("students.txt");
            Scanner sc = new Scanner(file);

            // true = append mode
            FileWriter fw = new FileWriter("report.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            while (sc.hasNext()) {
                String name = sc.next();
                int m1 = sc.nextInt();
                int m2 = sc.nextInt();
                int m3 = sc.nextInt();

                double avg = (m1 + m2 + m3) / 3.0;

                bw.write("Name: " + name +
                         " Average: " + avg);
                bw.newLine();
            }

            sc.close();
            bw.close();

            System.out.println("Report card generated.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Student file not found!");
        }
        catch (IOException e) {
            System.out.println("Error in file operation.");
        }
    }
}