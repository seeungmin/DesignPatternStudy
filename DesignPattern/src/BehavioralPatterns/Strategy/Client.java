package BehavioralPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new WalkStrategy());
        context.goSchool();

        context.setStrategy(new BikeStrategy());
        context.goSchool();

        context.setStrategy(new BusStrategy());
        context.goSchool();
    }
}
