package StructuralPatterns.Decorator;

abstract public class Decorator implements Component{
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public String add() {
        return component.add();
    }
}
