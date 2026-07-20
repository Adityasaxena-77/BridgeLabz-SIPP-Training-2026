package gcr_codebase.Inheritance.OnlineRetailOrderManagement;

class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    public void displayShippedDetails() {
        displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
