package BehavioralPatterns.State;

public class Off implements AirVolumeState{
    @Override
    public void push() {
        System.out.println("전원을 끕니다.");
    }
}
