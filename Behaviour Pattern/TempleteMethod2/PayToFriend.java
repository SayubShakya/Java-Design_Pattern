package TempleteMethod2;

public class PayToFriend extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validating Pay to Friend request");
    }

    @Override
    public void debitAmount() {
        System.out.println("Crediting amount to Pay to Friend account");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees for Pay to Friend payment");
    }

    @Override
    public void creditAmount() {
        System.out.println("Debiting amount from PayPal account");
    }

}
