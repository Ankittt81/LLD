package DesignPatterns.Factory.V0_Problem;

public class NoSqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("NoSql query object created");
    }
}
