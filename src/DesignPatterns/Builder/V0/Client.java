package DesignPatterns.Builder.V0;

public class Client {
    public static void main(String[] args) {
        SoldItemHelper soldItemHelper = new SoldItemHelper();
        soldItemHelper.setId(1);
        soldItemHelper.setItem("Book");
        soldItemHelper.setQuantity(5);
        soldItemHelper.setPrice(50);
        soldItemHelper.setDiscount(5.0);

        SoldItem soldItem=new SoldItem(soldItemHelper);
    }
}
