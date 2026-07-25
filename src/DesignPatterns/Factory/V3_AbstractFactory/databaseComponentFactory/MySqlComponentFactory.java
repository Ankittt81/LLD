package DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory;

import DesignPatterns.Factory.V3_AbstractFactory.transaction.RCTTransaction;
import DesignPatterns.Factory.V3_AbstractFactory.transaction.Transaction;
import DesignPatterns.Factory.V3_AbstractFactory.query.Query;
import DesignPatterns.Factory.V3_AbstractFactory.query.SqlQuery;

public class MySqlComponentFactory implements DataBaseComponentFactory {
    @Override
    public Query createQuery() {
        return new SqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RCTTransaction();
    }
}
