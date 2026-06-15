
import java.util.Scanner;
public class ElectricityBill{
     double Units;
     public double electricityBill(double units){
          double amount=(units>=50) ?5 : (units<=100) ? 10 : (units<=200) ? 15 :(units<=300) ? 20 : 30;
          return amount;
     }

     public void generateBill(double units, double amount){
          System.out.println("------------------------------------------------");
          System.out.println("Welcome to Electricity Board");
          System.out.println("Total Units consumed:"+units);
          System.out.println("Total Bill Amount to be Paid:" +amount);
          System.out.println("------------------------------------------------");

     }
     public static void main(String[] args){
          ElectricityBill electricityBill=new ElectricityBill();
          Scanner sc=new Scanner(System.in);
          double amount=electricityBill.electricityBill(electricityBill.Units=sc.nextDouble());
          double totalAmount=electricityBill.Units*amount;
          electricityBill.generateBill(electricityBill.Units, totalAmount);
          sc.close();
     }
     
}