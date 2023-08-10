package BehavioralPatterns.State;

public class High implements AirVolumeState{
    @Override
    public void push() {
        System.out.println("강풍입니다.");
    }
}
