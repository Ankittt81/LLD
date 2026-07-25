package DesignPatterns.Factory.V3_AbstractFactory;

public class SqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("Sql query object created");
    }
}
