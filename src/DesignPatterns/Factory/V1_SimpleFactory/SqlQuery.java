package DesignPatterns.Factory.V1_SimpleFactory;

public class SqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("Sql query object created");
    }
}
