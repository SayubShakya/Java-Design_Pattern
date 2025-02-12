package Mediator2;

public abstract class User {
    protected FacebookGroupMediator mediator;
    protected String name;

    public User(FacebookGroupMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive (String message);
    
}
