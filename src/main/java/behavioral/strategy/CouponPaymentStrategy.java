package behavioral.strategy;

public class CouponPaymentStrategy implements PaymentStrategy {

    public void pay() {
        System.out.println("Pay using coupon");
    }
}
