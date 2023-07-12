package StructuralPatterns.Decorator;

public class CheeseDecorator extends Decorator{
    public CheeseDecorator(Component hambergerComponent){
        super(hambergerComponent);
    }

    @Override
    public String add() {
        return super.add() + " 치즈 ";
    }
}
