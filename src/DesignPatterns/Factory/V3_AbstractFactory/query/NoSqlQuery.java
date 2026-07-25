package DesignPatterns.Factory.V3_AbstractFactory.query;

public class NoSqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("NoSql query object created");
    }
}
