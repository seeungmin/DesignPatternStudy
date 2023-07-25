package BehavioralPatterns.Iterator;

import java.util.List;

public class ShoppingBasketIterator implements Iterator{
    private List<Cosmetic> cosmetics;
    int index = 0;

    public ShoppingBasketIterator(List<Cosmetic> cosmetics) {
        this.cosmetics = cosmetics;
    }

    @Override
    public boolean hasNext() {
        return index < cosmetics.size();
    }

    @Override
    public Object next() {
        if (hasNext())
            return cosmetics.get(index ++);
        return null;
    }
}
