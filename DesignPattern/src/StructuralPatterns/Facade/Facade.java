package StructuralPatterns.Facade;

public class Facade {
    private String goodsName = "";
    private String chargeName = "";
    private String pickUpName = "";

    public Facade(String goodsName, String chargeName, String pickUpName) {
        this.goodsName = goodsName;
        this.chargeName = chargeName;
        this.pickUpName = pickUpName;
    }

    public void getGoods(){
        Goods goods = new Goods(goodsName);
        Charge charge = new Charge(chargeName);
        PickUp pickUp = new PickUp(pickUpName);

        goods.selectGoods();
        charge.chargeGoods();
        pickUp.pickUp();
    }
}
