package DesignPatterns.Factory.V3_AbstractFactory;

public class NoSqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("NoSql query object created");
    }
}
