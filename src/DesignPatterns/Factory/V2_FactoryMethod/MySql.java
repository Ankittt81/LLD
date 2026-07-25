package DesignPatterns.Factory.V2_FactoryMethod;

public class MySql extends Database {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL");
    }

    @Override
    Query createQuery() {
        return new SqlQuery();
    }
}
