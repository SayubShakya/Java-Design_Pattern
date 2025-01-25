package Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImp();

        User user1 = new UserImpl(mediator, "Sayub");
        User user2 = new UserImpl(mediator, "Ayub");
        User user3 = new UserImpl(mediator, "Yub");
        User user4 = new UserImpl(mediator, "Ub");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hello, everyone");

    }   
}

