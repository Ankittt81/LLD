package DesignPatterns.Singleton.V0;

public class DBConnectionPool {
    private static DBConnectionPool instance=null;
    private DBConnectionPool() {}

    public static DBConnectionPool getInstance() {
        if(instance== null){
            instance=new DBConnectionPool();
        }
        return instance;
    }
}


//Handles Single Threaded System
//Just short time issue,only at the one moment
//But due to only one variable only one obj will be used other will override
//then garbage collector comes and removes them but it consumes resources on creating resource whether only 1 is used still