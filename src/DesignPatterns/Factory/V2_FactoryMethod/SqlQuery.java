package DesignPatterns.Factory.V2_FactoryMethod;

public class SqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("Sql query object created");
    }
}
