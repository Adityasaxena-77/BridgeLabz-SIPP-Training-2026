import java.util.Scanner;

public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Mobile Phone Details ---");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : $" + String.format("%.2f", price));
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Mobile Phone Details Portal ===");
        System.out.print("Enter Mobile Phone Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Mobile Phone Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Mobile Phone Price: ");
        double price = scanner.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);

        phone.displayDetails();

        System.out.println("\nCreating a sample device automatically for comparison...");
        MobilePhone samplePhone = new MobilePhone("Apple", "iPhone 15", 999.99);
        samplePhone.displayDetails();

        scanner.close();
    }
}
