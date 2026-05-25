package Threads.AdderSubtractor.Mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Count count;
    Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    @Override
    public Void call() {

        for(int i=1;i<=1000;i++){
            lock.lock();
            count.value-=i;
            lock.unlock();
        }
        return null;
    }

}
