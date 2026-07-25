package DesignPatterns.Factory.V0_Problem;

public class MySql extends Database{

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL");
    }
}
