package StructuralPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Component hamberger = new LettuceDecorator(new BaseComponent());
        Component cheeseberger = new CheeseDecorator(new BaseComponent());

        System.out.println("cheeseberger = " + cheeseberger.add());
        System.out.println("hamberger = " + hamberger.add());
    }
}