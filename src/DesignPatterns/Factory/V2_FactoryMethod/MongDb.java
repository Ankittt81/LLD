package DesignPatterns.Factory.V2_FactoryMethod;

public class MongDb extends Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }

    @Override
    Query createQuery() {
        return new NoSqlQuery();
    }
}
