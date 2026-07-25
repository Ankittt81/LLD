package DesignPatterns.Factory.V3_AbstractFactory.db;

import DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory.DataBaseComponentFactory;

public abstract class  Database {
  public  abstract void connect();
    //get pool
//   public abstract Query createQuery();
//
//   public abstract Transaction createTransaction();
   // public abstract Updater createUpdater();

    public abstract DataBaseComponentFactory createDataBaseComponentFactory();

}
