package Mediator2;

public class Main {
    public static void main(String[] args) {
        FacebookGroupMediator mediator = new FacebookGroupMediatorImpl();

        User user1 = new UserImpl(mediator, "Sayub");
        User user2 = new UserImpl(mediator, "Ayub");
        User user3 = new UserImpl(mediator, "Yub");
        User user4 = new UserImpl(mediator, "Ub");

        mediator.registerUser(user1);
        mediator.registerUser(user2);
        mediator.registerUser(user3);
        mediator.registerUser(user4);

        user1.send("Hello, everyone");
        System.out.println("####################################################3");
        user2.send("hulluh");
    }   
}

