package DesignPatterns.Factory.V2_FactoryMethod;

public abstract class  Database {
    abstract void connect();
    abstract  Query createQuery();
}
