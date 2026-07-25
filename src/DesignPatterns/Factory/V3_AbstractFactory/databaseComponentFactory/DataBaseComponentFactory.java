package DesignPatterns.Factory.V3_AbstractFactory;

public interface DataBaseComponentFactory {
     Query createQuery();
    Transaction createTransaction();
    //Updator createUpdator();
}
