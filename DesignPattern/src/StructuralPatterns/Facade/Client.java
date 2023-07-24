package StructuralPatterns.Facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade("사이다", "카드", "배달");
        facade.getGoods();
    }
}
