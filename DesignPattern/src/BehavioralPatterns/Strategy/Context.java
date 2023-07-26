package BehavioralPatterns.Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void goSchool(){
        this.strategy.goSchool();
    }
}
