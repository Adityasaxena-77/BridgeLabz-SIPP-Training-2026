package gcr_codebase.Interfaces.OnlineCouponValidator;

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        return CouponValidator.isLengthValid(code);
    }

    public void checkCoupons(String[] coupons) {
        for (String code : coupons) {
            if (validateCoupon(code)) {
                System.out.println(code + " : Valid Coupon");
            } else {
                System.out.println(code + " : Invalid Coupon");
            }
        }
    }
}