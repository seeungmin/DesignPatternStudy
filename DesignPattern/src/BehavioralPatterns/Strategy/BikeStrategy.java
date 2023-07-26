package BehavioralPatterns.Strategy;

public class BikeStrategy implements Strategy{
    @Override
    public void goSchool() {
        System.out.println("자전거를 타고 갑니다.");
    }
}
