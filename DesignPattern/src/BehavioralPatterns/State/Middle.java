package BehavioralPatterns.State;

public class Middle implements AirVolumeState{
    @Override
    public void push() {
        System.out.println("중풍입니다.");
    }
}
