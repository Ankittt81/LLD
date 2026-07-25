package DesignPatterns.Factory.V3_AbstractFactory;

public class MongDb extends Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }

    @Override
    public DataBaseComponentFactory createDataBaseComponentFactory() {
        return new MongoDbComponentFactory();
    }

//    @Override
//  public  Query createQuery() {
//        return new NoSqlQuery();
//    }
}
