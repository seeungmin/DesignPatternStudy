package BehavioralPatterns.Memento;

public class OriginatorGame {
    private int level;
    private int stage;

    public Memento save(){
        return new Memento(this.level, this.stage);
    }

    public int getLevel() {
        return level;
    }

    public int getStage() {
        return stage;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }
}
