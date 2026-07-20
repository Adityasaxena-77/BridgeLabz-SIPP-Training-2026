class Order {

    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(int orderId,
                        String orderDate,
                        String trackingNumber) {

        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    public DeliveredOrder(int orderId,
                          String orderDate,
                          String trackingNumber,
                          String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OrderDemo {

    public static void main(String[] args) {

        Order o = new Order(101, "25-06-2026");
        ShippedOrder so = new ShippedOrder(102, "24-06-2026", "TR12345");
        DeliveredOrder d = new DeliveredOrder(
                103,
                "20-06-2026",
                "TR98765",
                "23-06-2026");

        System.out.println(o.getOrderStatus());
        System.out.println(so.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}