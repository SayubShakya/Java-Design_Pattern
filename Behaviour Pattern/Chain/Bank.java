package Chain;

public class Bank extends PaymentHandler{

    @Override
    public void handlePayment(double amount) {
        if(amount <= 500){
            System.out.println("Paid using bank: " + amount);
        }else{
            paymentHandler.handlePayment(amount);
        }
    }
    
}
