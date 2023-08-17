package BehavioralPatterns.Visitor;

public class Skt implements Agency{
    private String name = "Skt";

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
