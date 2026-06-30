package gcr_codebase.Inheritance.OnlineRetailOrderManagement;


class Order {

    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}