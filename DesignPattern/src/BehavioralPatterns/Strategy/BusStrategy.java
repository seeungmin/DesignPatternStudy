package BehavioralPatterns.Strategy;

public class BusStrategy implements Strategy{

    @Override
    public void goSchool() {
        System.out.println("버스를 타고 갑니다.");
    }
}
