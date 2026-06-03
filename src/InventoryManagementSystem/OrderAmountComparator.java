package InventoryManagementSystem;

import java.util.Comparator;

public class OrderAmountComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getAmount()>o2.getAmount()){
            return -1;
        }
        else if(o1.getAmount()<o2.getAmount()){
            return 1;
        }
        return 0;
    }
}
