package behavioral.template;

public class CreditCardPaymentValidator extends PaymentVaidator {
    @Override
    public void verifyPaymentCreation() {
        System.out.println("Create and verify payment using credit card");
    }
}
