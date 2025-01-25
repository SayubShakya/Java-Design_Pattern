package TempleteMethod2;

public abstract class PaymentFlow {
    public abstract void validateRequest();

    public abstract void calculateFees();

    public abstract void debitAmount();

    public abstract void creditAmount();

    // steps to step process
    public final void sendMoney() {
        // steps
        validateRequest();
        debitAmount();
        calculateFees();
        creditAmount();
    }
}
