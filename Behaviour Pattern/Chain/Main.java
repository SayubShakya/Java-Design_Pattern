package Chain;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();

        bank.setPaymentHandler(creditCard);
        creditCard.setPaymentHandler(payPal);

        bank.handlePayment(100);
        bank.handlePayment(600);
        bank.handlePayment(1300);
        bank.handlePayment(300);

    }
}
