package BehavioralPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class UserManagerMediator implements Mediator{

    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void deleteUser(User user) {
        this.users.remove(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User user1 : this.users){
            if (user1 != user)
                user1.receive(message);
        }
    }
}
