package TempleteMethod2;

public class Templete {
    public static void main(String[] args) {
        PaymentFlow PayToFriend = new PayToFriend();
        PayToFriend.sendMoney();

        System.out.println("--------------------------------");

        PaymentFlow PayToShop = new PayToShop();
        PayToShop.sendMoney();
    }
}
