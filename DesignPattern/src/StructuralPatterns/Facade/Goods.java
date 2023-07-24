package StructuralPatterns.Pacade;

public class Goods {
    private String name = "";

    public Goods(String name) {
        this.name = name;
    }

    public void selectGoods(){
        System.out.println(name + " 상품을 선택하였습니다.");
    }
}
