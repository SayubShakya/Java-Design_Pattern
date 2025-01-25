package Chain;

public class PayPal extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if(amount <=1500){
            System.out.println("Paid using PayPal: " + amount);
        }
    }
    
}
