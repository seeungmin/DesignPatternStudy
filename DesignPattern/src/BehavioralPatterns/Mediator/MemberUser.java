package BehavioralPatterns.Mediator;

public class MemberUser extends User{
    public MemberUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + "님이 보낸 메세지 입니다 : " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + "님이 받은 메세지 입니다 : " + message);
    }
}
