package behavioral.strategy;

public class Usage {

    public static void main(String[] args) {
        PaymentContext paymentUsingCard = new PaymentContext(new CreditCardPaymentStrategy());
        paymentUsingCard.pay();

        PaymentContext paymentUsingCoupon = new PaymentContext(new CouponPaymentStrategy());
        paymentUsingCoupon.pay();

        PaymentContext paymentPrivatPrivat = new PaymentContext(new PrivatPortalPaymentStrategy());
        paymentPrivatPrivat.pay();

    }
}
