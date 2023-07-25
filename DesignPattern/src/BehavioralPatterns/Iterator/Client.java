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

// 이거 깃 코드링크 블로그에도 올리고 다이어그램은 따로 잔디로 널어버리자