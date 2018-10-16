package behavioral.template;

public abstract class PaymentVaidator {

    public void validatePaymen() {
        verifyNavigation();
        verifyClickOnCreatePayment();
        verifyPaymentCreation();
    }

    public void verifyNavigation() {
        System.out.println("Navigate to page and verify");
    }

    public void verifyClickOnCreatePayment() {
        System.out.println("Verify click on create payment");
    }

    public abstract void verifyPaymentCreation();
}
