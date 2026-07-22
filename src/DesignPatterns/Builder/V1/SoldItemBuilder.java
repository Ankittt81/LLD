package DesignPatterns.Builder.V1;

public class SoldItemBuilder {
    private int id;
    private String item;
    private double price;
    private int quantity;
    private boolean isExpress;
    private double discount;

    public SoldItem build(){
        //SoldItem soldItem=new SoldItem(soldItemBuilder);
        return new SoldItem(this);
    }

    public int getId() {
        return id;
    }

    public SoldItemBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getItem() {
        return item;
    }

    public SoldItemBuilder setItem(String item) {
        this.item = item;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public SoldItemBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public SoldItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public SoldItemBuilder setExpress(boolean express) {
        isExpress = express;
        return this;
    }

    public double getDiscount() {
        return discount;
    }

    public SoldItemBuilder setDiscount(double discount) {
        this.discount = discount;
        return this;
    }
}
