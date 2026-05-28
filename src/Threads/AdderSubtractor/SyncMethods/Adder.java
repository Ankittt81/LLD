package Threads.AdderSubtractor.SyncMethods;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Count count;

    public Adder(Count count) {
        this.count = count;
    }

    public Void call(){
        for(int i=0;i<=1000;i++){

            count.incrementCountByX(i);
            //Java takes the lock on the object that is calling the sync method
        }
        return null;
    }
}
