package BehavioralPatterns.ChainOfResponsibility;

public class NoSupport extends Support{
    @Override
    public boolean check(Login login) {
        return true;
    }
}
