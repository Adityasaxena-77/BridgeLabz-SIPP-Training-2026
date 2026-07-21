package gcr_codebase.Inheritance.OnlineRetailOrderManagement;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(101, "20-08-2025");

        ShippedOrder shipped = new ShippedOrder(
                102,
                "21-08-2025",
                "TRK12345"
        );

        DeliveredOrder delivered = new DeliveredOrder(
                103,
                "22-08-2025",
                "TRK67890",
                "25-08-2025"
        );

        System.out.println("----- Order -----");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println();

        System.out.println("----- Shipped Order -----");
        shipped.displayShippedDetails();
        System.out.println("Status: " + shipped.getOrderStatus());

        System.out.println();

        System.out.println("----- Delivered Order -----");
        delivered.displayDeliveredDetails();
        System.out.println("Status: " + delivered.getOrderStatus());
    }
}