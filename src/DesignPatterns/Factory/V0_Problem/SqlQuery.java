package DesignPatterns.Factory.V0_Problem;

public class SqlQuery implements Query {
    @Override
    public void query() {
        System.out.println("Sql query object created");
    }
}
