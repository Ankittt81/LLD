package DesignPatterns.Builder.V2;



public class Client {
    public static void main(String[] args) {
        SoldItem soldItem=
                SoldItem
                        .builder()
                        .setId(1)
                        .setItem("Book")
                        .setQuantity(5)
                        .setPrice(50)
                        .setDiscount(5.0)
                        .build();
    }

    //This is the optimized version
    //As someone can still do this
    // SoldItem soldItem=new SoldItem(SoldItemBuilder);
    //To restrict this we made SoldItem class constructor private and
    // so,Builder class can access its constructor we make it to inner  class of Sold Item class
}
