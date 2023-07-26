package BehavioralPatterns.Strategy;

public class WalkStrategy implements Strategy{

    @Override
    public void goSchool() {
        System.out.println("걸어 갑니다.");
    }
}
