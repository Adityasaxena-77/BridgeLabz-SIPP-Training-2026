interface FoodDelivery {

    void deliverFood(String customer);

    default void trackOrder() {
        System.out.println("Food Order is on the way.");
    }

    static String generateDeliveryCode() {
        return "FD2026";
    }
}

interface GroceryDelivery {

    void deliverGroceries(String customer);

    default void trackOrder() {
        System.out.println("Grocery Order is on the way.");
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {

    @Override
    public void deliverFood(String customer) {
        System.out.println("Food delivered to " + customer);
    }

    @Override
    public void deliverGroceries(String customer) {
        System.out.println("Groceries delivered to " + customer);
    }

    @Override
    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }

    public static void main(String[] args) {

        String[] customers = {
                "Aditya",
                "Rahul",
                "Priya"
        };

        DeliveryExecutive executive = new DeliveryExecutive();

        System.out.println("Delivery Code: " + FoodDelivery.generateDeliveryCode());
        System.out.println();

        for (String customer : customers) {

            System.out.println("Customer: " + customer);

            executive.trackOrder();
            executive.deliverFood(customer);
            executive.deliverGroceries(customer);

            System.out.println();
        }
    }
}