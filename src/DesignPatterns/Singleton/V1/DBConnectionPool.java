package DesignPatterns.Singleton.V1;

public class DBConnectionPool {
    private static DBConnectionPool instance=null;
    private DBConnectionPool() {}

    public static synchronized DBConnectionPool getInstance() {
        if(instance== null){
            instance=new DBConnectionPool();
        }
        return instance;
    }
}


//Resolves concurrency problem
//short time issue resolves,but it creates issue for long term as only one request can go inside method while other will wait
//It is less efficient
//Not good solution