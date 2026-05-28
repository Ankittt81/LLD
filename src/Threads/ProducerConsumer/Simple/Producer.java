package Threads.ProducerConsumer.Simple;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        produce();
    }


    public void produce() {
        while (true) {
            if (store.getSize() < store.getMAX_SIZE()) {
                store.addItem(new Object());
                System.out.println("Produced Item, Curr Size of the store: " + store.getSize());
            }
        }
    }

}
