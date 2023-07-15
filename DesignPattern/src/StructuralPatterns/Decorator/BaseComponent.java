package StructuralPatterns.Decorator;

public class BaseComponent implements Component{
    @Override
    public String add() {
        return "빵 패티";
    }
}
