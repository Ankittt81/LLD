package Threads.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
     List<Integer> toSort;
     ExecutorService executor;
     public Sorter(List<Integer> input,ExecutorService executor){
         toSort = input;
         this.executor = executor;
     }
    @Override
    public List<Integer> call() throws Exception {
        return sort();
    }

    public List<Integer> sort() throws ExecutionException, InterruptedException {
         System.out.println("Sort this data: "+toSort+" in thread: "+ Thread.currentThread().getName());
         if(toSort.size()<=1){
             return toSort;
         }
         int mid=toSort.size()/2;
         List<Integer> leftArray=toSort.subList(0,mid);
         List<Integer> rightArray=toSort.subList(mid,toSort.size());

         //Threads
        Future<List<Integer>> leftFutureArray= executor.submit(new Sorter(leftArray,executor));
        Future<List<Integer>> rightFutureArray= executor.submit(new Sorter(rightArray,executor));
        List<Integer> leftSort=leftFutureArray.get();
        List<Integer> rightSort=rightFutureArray.get();
        int i=0;
        int j=0;
        List<Integer> result=new ArrayList<>();
        while(i<leftSort.size() && j<rightSort.size()){
            if(leftSort.get(i)<=rightSort.get(j)){
                result.add(leftSort.get(i));
                i++;
            }else{
                result.add(rightSort.get(j));
                j++;
            }
        }
        while(i<leftSort.size()){
            result.add(leftSort.get(i));
            i++;
        }
        while(j<rightSort.size()){
            result.add(rightSort.get(j));
            j++;
        }
        return result;
    }
}
