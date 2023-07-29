package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubscriber implements Subscriber{

    private List<Youtuber> youtubers = new ArrayList<>();

    @Override
    public void subscribe(Youtuber youtuber) {
        youtubers.add(youtuber);
        System.out.println(youtuber.toString() + " : 구독 완료");
    }

    @Override
    public void unSubscribe(Youtuber youtuber) {
        youtubers.remove(youtuber);
        System.out.println(youtuber.toString() + " : 구독 취소");
    }

    @Override
    public void notifyYoutuber() {
        for (Youtuber youtuber : youtubers)
            youtuber.send();
    }
}
