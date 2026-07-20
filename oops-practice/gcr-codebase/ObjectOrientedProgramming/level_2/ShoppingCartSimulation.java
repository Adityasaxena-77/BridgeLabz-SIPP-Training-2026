package level_2;

import java.util.ArrayList;
import java.util.List;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;


    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price >= 0.0 ? price : 0.0;
        this.quantity = quantity >= 0 ? quantity : 0;
    }


    public double getTotalItemPrice() {
        return price * quantity;
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
        this.price = price >= 0.0 ? price : 0.0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity >= 0 ? quantity : 0;
    }
}

class ShoppingCart {
    private List<CartItem> items;


    public ShoppingCart() {
        this.items = new ArrayList<>();
    }


    public void addItem(CartItem item) {
        if (item == null) {
            System.out.println("Error: Cannot add a null item.");
            return;
        }


        for (CartItem existingItem : items) {
            if (existingItem.getItemName().equalsIgnoreCase(item.getItemName())) {
                existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
                System.out.printf("Updated quantity of '%s' in cart. New quantity: %d\n", 
                        existingItem.getItemName(), existingItem.getQuantity());
                return;
            }
        }

        items.add(item);
        System.out.printf("Added '%s' (Qty: %d, Price: $%.2f) to cart.\n", 
                item.getItemName(), item.getQuantity(), item.getPrice());
    }


    public void removeItem(String itemName) {
        if (itemName == null) return;

        CartItem toRemove = null;
        for (CartItem item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                toRemove = item;
                break;
            }
        }

        if (toRemove != null) {
            items.remove(toRemove);
            System.out.printf("Removed '%s' from cart.\n", itemName);
        } else {
            System.out.printf("Error: '%s' not found in cart.\n", itemName);
        }
    }


    public void displayTotalCost() {
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                     SHOPPING CART                      |");
        System.out.println("+--------------------------------------------------------+");
        System.out.printf("| %-17s | %-8s | %-10s | %-10s |\n", "Item Name", "Price", "Quantity", "Total");
        System.out.println("+--------------------------------------------------------+");

        double grandTotal = 0.0;
        if (items.isEmpty()) {
            System.out.printf("| %-54s |\n", "Cart is empty.");
        } else {
            for (CartItem item : items) {
                double totalItemPrice = item.getTotalItemPrice();
                grandTotal += totalItemPrice;
                System.out.printf("| %-17s | $%-7.2f | %-10d | $%-9.2f |\n", 
                        item.getItemName(), item.getPrice(), item.getQuantity(), totalItemPrice);
            }
        }
        System.out.println("+--------------------------------------------------------+");
        System.out.printf("| %-41s | $%-9.2f |\n", "Grand Total:", grandTotal);
        System.out.println("+--------------------------------------------------------+");
        System.out.println();
    }
}

public class ShoppingCartSimulation {
    public static void main(String[] args) {
        System.out.println("=== Running Shopping Cart Simulation ===\n");


        ShoppingCart cart = new ShoppingCart();


        cart.displayTotalCost();


        System.out.println("--- Adding Items to Cart ---");
        cart.addItem(new CartItem("Laptop", 999.99, 1));
        cart.addItem(new CartItem("Headphones", 149.50, 2));
        cart.addItem(new CartItem("Mouse", 25.00, 1));
        System.out.println();


        cart.displayTotalCost();


        System.out.println("--- Adding Duplicate Item (Updates Quantity) ---");
        cart.addItem(new CartItem("Headphones", 149.50, 1));
        System.out.println();
        cart.displayTotalCost();


        System.out.println("--- Removing Item from Cart ---");
        cart.removeItem("Mouse");
        System.out.println();
        cart.displayTotalCost();


        System.out.println("--- Attempting to Remove Non-Existent Item ---");
        cart.removeItem("Keyboard");
        System.out.println();


        System.out.println("--- Final Cart State ---");
        cart.displayTotalCost();
    }
}
