package DesignPatterns.Builder.V1;

public class Client {
    public static void main(String[] args) {
        SoldItemBuilder soldItemBuilder1 = new SoldItemBuilder();
        soldItemBuilder1.setId(1);
        soldItemBuilder1.setItem("Book");
        soldItemBuilder1.setQuantity(5);
        soldItemBuilder1.setPrice(50);
        soldItemBuilder1.setDiscount(5.0);

        SoldItem soldItem1=new SoldItem(soldItemBuilder1);

        //1st Optimization-Remove redundancy of SoldItemHelper.set by returning current object after setting value in setter
        SoldItemBuilder soldItemBuilder2 = new SoldItemBuilder();
        soldItemBuilder2
                .setId(1)
                .setItem("Book")
                .setQuantity(5)
                .setPrice(50)
                .setDiscount(5.0);

        SoldItem soldItem2=new SoldItem(soldItemBuilder2);

        //2nd Optimization-Client themselves do not need to create Builder Object.
        // They can go to SoldItem class and get Builder Object for them.
        SoldItemBuilder soldItemBuilder3 =SoldItem.builder();
        soldItemBuilder3
                .setId(1)
                .setItem("Book")
                .setQuantity(5)
                .setPrice(50)
                .setDiscount(5.0);

        SoldItem soldItem3=new SoldItem(soldItemBuilder3);

        //3rd Optimization-Client can ask Builder to create Object of SoldItem for u
        SoldItemBuilder soldItemBuilder4 =SoldItem.builder();
        soldItemBuilder4
                .setId(1)
                .setItem("Book")
                .setQuantity(5)
                .setPrice(50)
                .setDiscount(5.0);

        SoldItem soldItem4=soldItemBuilder4.build();

        //Combine All Optimization
        SoldItem soldItem=
                SoldItem
                        .builder()  //-> SoldItemBuilder
                        .setId(1)
                        .setItem("Book")
                        .setQuantity(5)
                        .setPrice(50)
                        .setDiscount(5.0)
                        .build();   // soldItemBuilder.build
    }
}
