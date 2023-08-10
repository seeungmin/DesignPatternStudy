package BehavioralPatterns.State;

public class Low implements AirVolumeState{
    @Override
    public void push() {
        System.out.println("약풍입니다.");
    }
}
