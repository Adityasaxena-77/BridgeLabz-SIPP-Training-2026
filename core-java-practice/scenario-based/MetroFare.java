
import java.util.*;

public class MetroFare {
    public static void main(String[] args) {
        double balance = 600.00;

        while (balance > 0) {
            System.out.println("----------------------------------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the distance in KM or Type  -1 to exit");
            double distance = sc.nextDouble();
            
            System.out.println("Enter the number of passengers");
            int numberofpassengers = sc.nextInt();
            if (distance == -1) {
                break;
            }
            // fare calculation
            double fare = (distance < 5) ? 10 : (distance <= 10) ? 20 : (distance <= 20) ? 30 : 50;
            // balance calculation
            if (balance > fare) {
                fare *= numberofpassengers;
                balance = balance - fare;
                System.out.println("Available Balance in your card is: " + balance);
            } else {
                System.out.println("Insufficient balance in your card Balance !!!");
            }
            System.out.println("Thank you for traveling in Delhi Metro");
            System.out.println("----------------------------------------------------------------");

        }
        System.out.println("Card time Exceded or Balance is  Zero");
    }
}