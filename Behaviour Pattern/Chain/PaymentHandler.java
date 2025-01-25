package Chain;

public abstract class PaymentHandler {
    protected PaymentHandler paymentHandler; //fields/object/instance

    //Getter and setter
    public PaymentHandler getPaymentHandler() {
        return paymentHandler;
    }

    public void setPaymentHandler(PaymentHandler paymentHandler) {
        this.paymentHandler = paymentHandler;
    }

    //Method
    public abstract void handlePayment(double amount);
    
}
