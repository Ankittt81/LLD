package Threads.AdderSubtractor.Mutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Count count = new Count();
        ExecutorService executor= Executors.newCachedThreadPool();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count,lock);
        Subtractor subtractor=new Subtractor(count,lock);
        Future<Void> res1=executor.submit(adder);
        Future<Void> res2=executor.submit(subtractor);
        res1.get();
        res2.get();
        System.out.println("Value of x: "+ count.value);
    }
}
