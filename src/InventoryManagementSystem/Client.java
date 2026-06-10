package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {
        Item item1=new Item("1","Pen",10.0,5);
        Item item2=new Item("2","Calender",15.0,10);

        Electronics electronics=new Electronics("3","Ipad",100.0,2,3);
        Book book=new Book("4","Clean Code",30.0,3,"ABC");
        Clothing clothing=new Clothing("5","Socks",2.0,3,"5");

        List<Item> items=new ArrayList<Item>();
        items.add(item1);
        items.add(item2);
        items.add(electronics);
        items.add(book);
        items.add(clothing);

        Collections.sort(items,new ItemQuantityComparator());

        for(Item item :items){
            System.out.println(item.getId()+" "+ item.getName()+" "+item.getQuantity());
        }

        Inventory inventory=new Inventory();
        inventory.addItem(item1);
        inventory.addItem(electronics);
        inventory.addItem(book);

        //Above statement have not generic type but still run because of java backward compatibility feature

        Inventory<Electronics> electronicsInventory=new Inventory<>();
        //electronicsInventory.addItem(item1);
       // electronicsInventory.addItem(book);
        //Above 2 statements give error as now electronicsInventory is bound to Electronics item only.
        // we create specific item inventory of Electronics
        electronicsInventory.addItem(electronics);

        Order order1=new Order(1,true,20);
        Order order2=new Order(2,true,10);
        Order order3=new Order(3,false,100);
        Order order4=new Order(4,true,50);
        Order order5=new Order(5,false,80);
        Order order6=new Order(6,true,40);

        PriorityQueue<Order> pq=new PriorityQueue<>(new OrderAmountComparator());
        OrderProcessor orderProcessor=new OrderProcessor(pq);

        orderProcessor.addOrder(order1);
        orderProcessor.addOrder(order2);
        orderProcessor.addOrder(order3);
        orderProcessor.addOrder(order4);
        orderProcessor.addOrder(order5);
        orderProcessor.addOrder(order6);

        orderProcessor.processAllOrders();

        //print id of orders using streams
      //  items.stream().forEach(i->System.out.println(i.getId()));
        items.stream().map((x)->x.getId()).forEach((i)->System.out.println(i));
        List<Integer> lenghts=items.stream().map((x)->x.getName().length()).toList();
       List<String> names= items.stream()
                .filter((x)->x.getPrice()>1000 && x.getQuantity()>0)
                .map((x)->x.getName())
                .distinct()
                .sorted()
                .limit(5)
                .toList();
    }
}
