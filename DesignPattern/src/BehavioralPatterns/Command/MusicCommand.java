package BehavioralPatterns.Command;

public class MusicCommand implements Command{
    private IPhone iPhone;

    public MusicCommand(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public void execute() {
        iPhone.MusicStart();
    }
}
