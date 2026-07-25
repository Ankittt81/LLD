package DesignPatterns.Factory.V3_AbstractFactory;

public class MongoDbComponentFactory implements  DataBaseComponentFactory {
    @Override
    public Query createQuery() {
        return new NoSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RUTTransaction();
    }
}
