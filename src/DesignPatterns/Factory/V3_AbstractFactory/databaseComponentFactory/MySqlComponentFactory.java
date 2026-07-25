package DesignPatterns.Factory.V3_AbstractFactory;

public class MySqlComponentFactory implements DataBaseComponentFactory {
    @Override
    public Query createQuery() {
        return new SqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RCTTransaction();
    }
}
