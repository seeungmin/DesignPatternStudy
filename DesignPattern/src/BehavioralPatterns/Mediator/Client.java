package BehavioralPatterns.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new UserManagerMediator();

        User user1 = new MemberUser(mediator, "철수");
        User user2 = new MemberUser(mediator, "영희");
        User user3 = new MemberUser(mediator, "가영");
        User user4 = new MemberUser(mediator, "진수");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("하윙");

        mediator.deleteUser(user2);

        user3.send("반가워");

    }
}
