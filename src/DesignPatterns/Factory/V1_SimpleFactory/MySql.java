package DesignPatterns.Factory.V1_SimpleFactory;

public class MySql extends Database {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL");
    }
}
