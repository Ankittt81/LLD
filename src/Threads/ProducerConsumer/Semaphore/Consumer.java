package Threads.ProducerConsumer.Semaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    Semaphore producerSemaphore,consumerSemaphore;

    public Consumer(
            Store store,
            Semaphore producerSemaphore,
            Semaphore consumerSemaphore
                   ){
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        try {
            consume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
         //   if(store.getSize()>0)
                consumerSemaphore.acquire();
                store.removeItem();
                System.out.println("Consumed Item, Curr Size of the store: " + store.getSize());
                producerSemaphore.release();

        }
    }


}
