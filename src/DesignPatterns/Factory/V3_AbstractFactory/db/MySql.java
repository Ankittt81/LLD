package DesignPatterns.Factory.V3_AbstractFactory;

public class MySql extends Database {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL");
    }

    @Override
    public DataBaseComponentFactory createDataBaseComponentFactory() {
        return new MySqlComponentFactory();
    }

//    @Override
//   public Query createQuery() {
//        return new SqlQuery();
//    }
}
