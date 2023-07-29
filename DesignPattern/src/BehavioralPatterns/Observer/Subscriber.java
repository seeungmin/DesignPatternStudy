package BehavioralPatterns.Observer;

public interface Subscriber {
    public void subscribe(Youtuber youtuber);
    public void unSubscribe(Youtuber youtuber);
    public void notifyYoutuber();
}
