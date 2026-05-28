package Threads.ProducerConsumer.Simple;

public class Consumer implements Runnable{
    private Store  store;

    public Consumer(Store store) {
        this.store = store;
    }
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        consume();
    }

    public void consume() {
        while (true) {
            if(store.getSize()>0){
                store.removeItem();
                System.out.println("Consumed Item, Curr Size of the store: " + store.getSize());
            }
        }
    }


}
