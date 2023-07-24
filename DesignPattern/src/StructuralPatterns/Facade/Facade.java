package StructuralPatterns.Facade;

public class Facade {
    private String goodsName = "";
    private String chargeName = "";

    public Facade(String goodsName, String chargeName) {
        this.goodsName = goodsName;
        this.chargeName = chargeName;
    }

    public void getGoods(){
        Goods goods = new Goods(goodsName);
        Charge charge = new Charge(chargeName);

        goods.selectGoods();
        charge.chargeGoods();
    }
}
