package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator {
    private List<User> users;

    public ChatMediatorImp(){
        this.users = new ArrayList<>();
    } //manages users

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users){
            if( u !=user){
                u.receive("From "+ user.name + ": " +message);
            }
        } //sends msg ti all users
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

}
