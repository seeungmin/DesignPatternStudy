package BehavioralPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        Subscriber subscriber = new ConcreteSubscriber();

        Youtuber youtuberA = new YoutuberA();
        Youtuber youtuberB = new YoutuberB();

        subscriber.subscribe(youtuberA);
        subscriber.subscribe(youtuberB);

        subscriber.notifyYoutuber();

        subscriber.unSubscribe(youtuberB);

        subscriber.notifyYoutuber();
    }
}
