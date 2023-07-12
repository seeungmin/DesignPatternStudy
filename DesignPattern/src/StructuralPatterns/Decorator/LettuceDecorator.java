package StructuralPatterns.Decorator;

public class LettuceDecorator extends Decorator{
    public LettuceDecorator(Component hambergerComponent){
        super(hambergerComponent);
    }

    @Override
    public String add() {
        return super.add() + " 양배추 ";
    }
}
