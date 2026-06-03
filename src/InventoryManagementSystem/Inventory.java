package InventoryManagementSystem;

import java.util.HashMap;

public class Inventory<T extends Item> {
    //we should be easily lokkup itmes with id
    private HashMap<String,T> inventory;

    public Inventory(){
        inventory = new HashMap<>();
    }

    public void addItem(T item){
        inventory.put(item.getId(),item);
    }
    public void removeItem(T item){
        inventory.remove(item.getId());
    }
}
