package StructuralPatterns.Bridge;

public abstract class Milk {
    public Fat fat;

    public Milk(Fat fat){
        this.fat = fat;
    }

    public abstract String getMilk();
}
