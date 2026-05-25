package Threads.AdderSubtractor.Mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Count count;
    Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    public Void call(){
        for(int i=0;i<=1000;i++){
            lock.lock();
            count.value+=i;
            lock.unlock();
        }
        return null;
    }
}
