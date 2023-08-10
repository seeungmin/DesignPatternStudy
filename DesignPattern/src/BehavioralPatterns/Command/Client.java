package BehavioralPatterns.Command;

public class Client {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        Command musicCommand = new MusicCommand(iPhone);
        Command weatherCommand = new WeatherCommand(iPhone);
        Siri siri = new Siri();

        siri.setCommand(musicCommand);
        siri.run();

        siri.setCommand(weatherCommand);
        siri.run();
    }
}
