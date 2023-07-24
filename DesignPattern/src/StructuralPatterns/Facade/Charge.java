package StructuralPatterns.Facade;

public class Charge {
    private String name = "";

    public Charge(String name) {
        this.name = name;
    }

    public void chargeGoods(){
        if (!(name == "카드" || name == "현금")) {
            System.out.println(name + "-> 잘못된 결제 방식 입니다.");
            return;
        }
        System.out.println(name + "결제입니다.");
    }
}
