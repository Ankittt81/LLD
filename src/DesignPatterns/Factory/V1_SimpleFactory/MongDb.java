package DesignPatterns.Factory.V1_SimpleFactory;

public class MongDb extends Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }
}
