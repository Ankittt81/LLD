package DesignPatterns.Factory.V3_AbstractFactory.db;

import DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory.DataBaseComponentFactory;
import DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory.MongoDbComponentFactory;

public class MongDb extends Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }

    @Override
    public DataBaseComponentFactory createDataBaseComponentFactory() {
        return new MongoDbComponentFactory();
    }

}
