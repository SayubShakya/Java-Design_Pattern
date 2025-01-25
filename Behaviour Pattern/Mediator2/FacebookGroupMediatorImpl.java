package Mediator2;

import java.util.ArrayList;
import java.util.List;

public class FacebookGroupMediatorImpl implements FacebookGroupMediator {
    private List<User> users;

    public FacebookGroupMediatorImpl(){
        this.users = new ArrayList<User>();
    } //manages users

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users){
            if( u !=user){
                u.receive("From "+ user.name + ": " +message);
            }
        } //sends msg to all users
    }

    @Override
    public void registerUser(User user) {
        this.users.add(user);
    }
}
