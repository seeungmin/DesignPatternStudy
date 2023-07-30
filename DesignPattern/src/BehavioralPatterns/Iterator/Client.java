package BehavioralPatterns.Iterator;

public class Client {
    public static void main(String[] args) {
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        shoppingBasket.addCosmetic("토너");
        shoppingBasket.addCosmetic("로션");
        shoppingBasket.addCosmetic("크림");

        Iterator it = shoppingBasket.createIterator();
        while (it.hasNext()){
            Cosmetic cosmetic = (Cosmetic) it.next();
            System.out.println("화장품 : " + cosmetic.getName());
        }
    }
}

