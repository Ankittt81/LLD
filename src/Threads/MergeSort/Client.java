package Threads.MergeSort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> array= Arrays.asList(8,5,2,9,6,1,7);
        System.out.println("Current Thread1: "+Thread.currentThread().getName());
        ExecutorService executor = Executors.newCachedThreadPool();
        System.out.println("Current Thread2: "+Thread.currentThread().getName());
        Sorter sorter = new Sorter(array,executor);
        System.out.println("Current Thread3: "+Thread.currentThread().getName());
        System.out.println(executor.submit(sorter).get());
    }
}
