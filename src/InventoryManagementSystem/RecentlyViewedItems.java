package InventoryManagementSystem;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private LinkedList<Item> items;
    private int MAX_SIZE=3;

    public RecentlyViewedItems() {
        items = new LinkedList<>();
    }
    public RecentlyViewedItems(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        items = new LinkedList<>();
    }

    public void addRecentlyViewedItem(Item item) {
        //If this item is already present. we should remove it
        items.remove(item);
        items.addFirst(item);

        if(items.size()>MAX_SIZE){
            items.removeLast();
        }
    }

    public List<Item> getRecentlyViewedItems() {
        return items;
    }
}
