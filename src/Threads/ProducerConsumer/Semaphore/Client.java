package Threads.ProducerConsumer.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store=new Store(6);
        ExecutorService executors= Executors.newCachedThreadPool();
        Semaphore producerSemaphore=new Semaphore(store.getMAX_SIZE());
        Semaphore consumerSemaphore =new Semaphore(0);
        for(int i=1;i<=9;i++){
            Producer producer=new Producer(store,producerSemaphore, consumerSemaphore);
            executors.execute(producer);
        }
        for(int i=1;i<=20;i++){
            Consumer consumer=new Consumer(store,producerSemaphore, consumerSemaphore);
            executors.execute(consumer);
        }
    }
}
