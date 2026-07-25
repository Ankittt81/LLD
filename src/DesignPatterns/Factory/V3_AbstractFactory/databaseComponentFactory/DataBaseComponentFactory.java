package DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory;

import DesignPatterns.Factory.V3_AbstractFactory.transaction.Transaction;
import DesignPatterns.Factory.V3_AbstractFactory.query.Query;

public interface DataBaseComponentFactory {
     Query createQuery();
    Transaction createTransaction();
    //Updator createUpdator();
}
