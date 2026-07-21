package gcr_codebase.Interfaces.OnlineCouponValidator;

public class Main {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "AB12",
                "WELCOME",
                "OFF",
                "DISCOUNT50"
        };

        ShoppingCart cart = new ShoppingCart();

        cart.checkCoupons(coupons);
    }
}