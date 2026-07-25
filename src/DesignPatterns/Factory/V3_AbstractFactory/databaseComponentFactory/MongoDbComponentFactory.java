package DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory;

import DesignPatterns.Factory.V3_AbstractFactory.transaction.RUTTransaction;
import DesignPatterns.Factory.V3_AbstractFactory.transaction.Transaction;
import DesignPatterns.Factory.V3_AbstractFactory.query.NoSqlQuery;
import DesignPatterns.Factory.V3_AbstractFactory.query.Query;

public class MongoDbComponentFactory implements DataBaseComponentFactory {
    @Override
    public Query createQuery() {
        return new NoSqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RUTTransaction();
    }
}
