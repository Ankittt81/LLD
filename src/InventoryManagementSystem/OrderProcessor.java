package InventoryManagementSystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    private Queue<Order> orderToBeProcessed;

    public OrderProcessor(){
        orderToBeProcessed=new PriorityQueue<>();
    }

    public OrderProcessor(PriorityQueue<Order> pq){
        orderToBeProcessed=pq;
    }

    public void addOrder(Order order){
        orderToBeProcessed.add(order);
    }

    public void processOrder(){
        Order order=orderToBeProcessed.poll();
        System.out.println("Processing Order: "+ order.getId());
    }

    public void processAllOrders(){
        while(!orderToBeProcessed.isEmpty()){
            processOrder();
        }
    }
}
