package BehavioralPatterns.Visitor;

public class Lg implements Agency{
    private String name = "Lg";

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLg(this);
    }
}
