import java.util.Scanner;

public class TaxBracket {
    public static void main(String[] args) {

        double tax = 0;
        double income;
        String tax_Bracket = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        income = sc.nextDouble();

        if (income <= 10000) {
            tax = income * 0.05;
            tax_Bracket = "Tax of 5%";
        } 
        else if (income <= 20000) {
            tax = income * 0.10;
            tax_Bracket = "Tax of 10%";
        } 
        else if (income <= 30000) {
            tax = income * 0.20;
            tax_Bracket = "Tax of 20%";
        } 
        else if (income <= 40000) {
            tax = income * 0.30;
            tax_Bracket = "Tax of 30%";
        } 
        else {
            tax = income * 0.40;
            tax_Bracket = "Tax of 40%";
        }

        System.out.println("Income: " + income);
        System.out.println("Tax Bracket: " + tax_Bracket);
        System.out.println("Tax Amount: " + tax);

        sc.close();
    }
}