package DesignPatterns.Singleton.V3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnectionPool {
    private static Lock lock = new ReentrantLock();
    private static DBConnectionPool instance=null;
    private DBConnectionPool() {}

    public static DBConnectionPool getInstance() {
        if (instance == null) {
            lock.lock();
            if(instance == null) {
                instance = new DBConnectionPool();
            }
           lock.unlock();
        }
        return instance;
    }
}


//Optimized Solution
//Also called Double check locking,Lazy instantiation