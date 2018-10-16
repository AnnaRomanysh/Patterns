package behavioral.template;

public class Usage {
    public static void main(String[] args) {
        CreditCardPaymentValidator creditCardPaymentValidator=new CreditCardPaymentValidator();
        creditCardPaymentValidator.validatePaymen();

        CouponPaymentValidator couponPaymentValidator=new CouponPaymentValidator();
        couponPaymentValidator.validatePaymen();
    }
}
