package StructuralPatterns.Facade;

public class PickUp {
    private String name = "";

    public PickUp(String name) {
        this.name = name;
    }

    public void pickUp(){
        if (name == "포장" || name == "배달") {
            System.out.println(name + "입니다.");
            return;
        }
        System.out.println("잘못된 픽업입니다.");
    }
}
