package BehavioralPatterns.Mediator;

public interface Mediator {
    public void addUser(User user);
    public void deleteUser(User user);
    public void sendMessage(User user, String message);
}
