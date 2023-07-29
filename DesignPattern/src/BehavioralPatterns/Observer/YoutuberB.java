package BehavioralPatterns.Observer;

public class YoutuberB implements Youtuber{
    @Override
    public void send() {
        System.out.println("YoutuberA가 알림을 보냈습니다.");
    }

    @Override
    public String toString() {
        return "YoutuberB";
    }
}
