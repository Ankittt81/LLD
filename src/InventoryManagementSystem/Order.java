package InventoryManagementSystem;

public class Order implements Comparable<Order>{
    private int id;
    private boolean isExpress;
    private int amount;

    public Order(int id, boolean isExpress,int amount) {
        this.id = id;
        this.isExpress = isExpress;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        // isExpress : should come first
        // tie- breaker , id should resolve it
        if(this.isExpress && !o.isExpress){
            return -1;
        }
        else if(!this.isExpress && o.isExpress){
            return 1;
        }
        else{
            if(this.getId()<o.getId()){
                return -1;
            }
            else if(this.getId()>o.getId()){
                return 1;
            }
        }
        return 0;
    }
}
