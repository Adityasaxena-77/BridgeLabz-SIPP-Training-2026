import java.util.Scanner;

public class Item {
    private String itemCode;
    private String itemName;
    private double price;

    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
        System.out.println("\n--- Item Details ---");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Unit Price: $" + String.format("%.2f", price));
        System.out.println("--------------------");
    }

    public double calculateTotalCost(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative. Setting total cost to $0.00.");
            return 0.0;
        }
        return this.price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Inventory Item Entry ===");
        System.out.print("Enter Item Code: ");
        String itemCode = scanner.nextLine();

        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();

        Item item = new Item(itemCode, itemName, price);

        item.displayDetails();

        System.out.print("Enter Quantity to Calculate Total Cost: ");
        int quantity = scanner.nextInt();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: $" + String.format("%.2f", totalCost));

        scanner.close();
    }
}
