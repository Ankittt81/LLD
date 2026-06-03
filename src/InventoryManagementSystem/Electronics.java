package InventoryManagementSystem;

import java.time.LocalDateTime;

public class Electronics extends Item{
    private Integer warranty;

    public Electronics(Integer warranty){
        this.warranty = warranty;
    }

    public Electronics(String id, String name, Double price, Integer quantity,Integer warranty){
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public void setWarranty(Integer warranty) {
        this.warranty = warranty;
    }
}
