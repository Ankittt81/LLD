package Threads.ProducerConsumer.Simple;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store=new Store(5);
        ExecutorService executors= Executors.newCachedThreadPool();
        for(int i=1;i<=9;i++){
            Producer producer=new Producer(store);
            executors.execute(producer);
        }
        for(int i=1;i<=20;i++){
            Consumer consumer=new Consumer(store);
            executors.execute(consumer);
        }
    }
}
