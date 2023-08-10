package BehavioralPatterns.Command;

public class WeatherCommand implements Command{
    private IPhone iPhone;

    public WeatherCommand(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public void execute() {
        iPhone.WeatherExplain();
    }
}
