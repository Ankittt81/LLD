package DesignPatterns.Singleton.V2;

public class DBConnectionPool {
    private static DBConnectionPool instance=new DBConnectionPool();
    private DBConnectionPool() {}

    public static DBConnectionPool getInstance() {
        return instance;
    }
}


//Resolves concurrency problem
//It creates obj when class loads.It is called eager instantiation

//Issues
//1. If no one asks for obj,your obj creation gets wasted
//2. What if obj creation require some input,which is not available at class loading (Major Issue)
//3. Loading time increases