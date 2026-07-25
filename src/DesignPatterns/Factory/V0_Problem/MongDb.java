package DesignPatterns.Factory.V0_Problem;

public class MongDb extends Database{
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB");
    }
}
