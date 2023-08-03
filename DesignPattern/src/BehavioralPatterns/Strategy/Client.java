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

        context.setStrategy(new Strategy() {
            @Override
            public void goSchool() {
                System.out.println("1회용");
            }
        });
        context.goSchool();
    }
}
