package Threads.AdderSubtractor.SyncMethods;

public class Count {
    int value;

    public Count(){
        this.value = 0;
    }

    public synchronized void incrementCountByX(int x){
        this.value+=x;
    }
    public synchronized void decrementCountByX(int x){
        this.value-=x;
    }
}
