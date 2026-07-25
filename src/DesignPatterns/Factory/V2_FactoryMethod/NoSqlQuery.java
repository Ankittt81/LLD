package DesignPatterns.Factory.V2_FactoryMethod;

public class NoSqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("NoSql query object created");
    }
}
