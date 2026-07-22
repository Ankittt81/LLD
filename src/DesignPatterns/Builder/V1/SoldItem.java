package DesignPatterns.Builder.V1;

public class SoldItem {
    private int id;
    private String item;
    private double price;
    private int quantity;
    //Optional Parameter
    private boolean isExpress;
    private double discount;

    public SoldItem(SoldItemBuilder soldItemBuilder) {
        // validations of mandatory parameters + conditions in the constructor itself
        if(soldItemBuilder.getQuantity()==0){
            throw new IllegalStateException("Quantity has to be greater than 0!");
        }
        id = soldItemBuilder.getId();
        isExpress = soldItemBuilder.isExpress();
    }

    public static SoldItemBuilder builder(){
        return new SoldItemBuilder();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
