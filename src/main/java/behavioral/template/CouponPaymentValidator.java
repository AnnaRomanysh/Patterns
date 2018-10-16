package behavioral.template;

public class CouponPaymentValidator extends PaymentVaidator {
    @Override
    public void verifyPaymentCreation() {
        System.out.println("Create and verify payment using coupon");
    }
}
