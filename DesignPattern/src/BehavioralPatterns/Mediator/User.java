package BehavioralPatterns.Mediator;

public abstract class User {
    public Mediator mediator;
    public String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
