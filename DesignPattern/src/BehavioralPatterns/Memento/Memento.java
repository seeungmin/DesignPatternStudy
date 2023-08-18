package BehavioralPatterns.Memento;


public final class Memento {
    private int level;
    private int stage;

    public Memento(int level, int stage) {
        this.level = level;
        this.stage = stage;
    }

    public int getLevel() {
        return level;
    }

    public int getStage() {
        return stage;
    }
}
