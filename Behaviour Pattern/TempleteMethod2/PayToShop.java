package TempleteMethod2;

public class PayToShop extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validating Pay to shop request");
    }

    @Override
    public void debitAmount() {
        System.out.println("Crediting amount to Pay to shop account");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees for Pay to shop payment");
    }

    @Override
    public void creditAmount() {
        System.out.println("Debiting amount from shop PayPal account");
    }

}
