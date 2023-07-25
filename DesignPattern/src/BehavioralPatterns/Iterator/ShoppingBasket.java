package BehavioralPatterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket implements Aggregate{
    public List<Cosmetic> cosmetics;

    public ShoppingBasket(){
        this.cosmetics = new ArrayList<>();
    }

    public void addCosmetic(String name){
        Cosmetic cosmetic = new Cosmetic(name);
        cosmetics.add(cosmetic);
    }

    @Override
    public Iterator createIterator() {
        return new ShoppingBasketIterator(this.cosmetics);
    }
}
