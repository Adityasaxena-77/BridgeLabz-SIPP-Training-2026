import java.util.Scanner;

public class CoffieCalcultor {
    int Quantity;
    String CoffeeTypes;
        public double calculatePrice(double price)
        {
            double bill = price*Quantity;
            double gst = price*0.18;
            double finalBill = bill + gst;
            return finalBill;
        }
    
        public void generateBill(double bill)
        {
            System.out.println("------------------------------------------");
            System.out.println("COFFEE TYPE-> " + CoffeeTypes);
            System.out.println("QUANTITY-> " + Quantity);
            System.out.println("BILL AMOUNT-> " + bill);
            System.out.println("THANK YOU FOR VISIT!!");
            System.out.println("------------------------------------------");
        }
    public static void main(String[] args){
        System.out.println("Choose Coffee Type or Exit!!");
        System.out.println("1.Cappaccino-150\n2.Latte-250\n3.Esspreso-245\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Enter the Quantity");
        CoffieCalcultor coffee = new CoffieCalcultor();
        coffee.Quantity = sc.nextInt();
        switch (choice){
            case 1: 
            coffee.calculatePrice(150);
            coffee.generateBill(coffee.calculatePrice(150));
            coffee.CoffeeTypes= "Cappaccino";
            break;

            case 2:
            coffee.calculatePrice(245);
            coffee.generateBill(coffee.calculatePrice(245));
            coffee.CoffeeTypes= "Latte";
            break; 

            case 3:
            coffee.calculatePrice(150);
            coffee.generateBill(coffee.calculatePrice(250));
            coffee.CoffeeTypes= "Esspreso";
            break;
        }
        
    }
}