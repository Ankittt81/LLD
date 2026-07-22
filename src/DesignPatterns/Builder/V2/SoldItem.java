package DesignPatterns.Builder.V2;

public class SoldItem {
    private int id;
    private String item;
    private double price;
    private int quantity;
    //Optional Parameter
    private boolean isExpress;
    private double discount;

    private SoldItem(SoldItemBuilder soldItemBuilder) {
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


    static class SoldItemBuilder {
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
}
