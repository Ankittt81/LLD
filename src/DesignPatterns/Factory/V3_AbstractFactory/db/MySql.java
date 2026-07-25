package DesignPatterns.Factory.V3_AbstractFactory.db;

import DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory.DataBaseComponentFactory;
import DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory.MySqlComponentFactory;

public class MySql extends Database {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL");
    }

    @Override
    public DataBaseComponentFactory createDataBaseComponentFactory() {
        return new MySqlComponentFactory();
    }


}
