package DesignPatterns.Factory.V1_SimpleFactory;

public class NoSqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("NoSql query object created");
    }
}
