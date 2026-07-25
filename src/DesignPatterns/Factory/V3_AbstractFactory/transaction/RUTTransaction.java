package DesignPatterns.Factory.V3_AbstractFactory;

public class RUTTransaction implements Transaction{

    @Override
    public void transaction() {
        System.out.println("RUTTransaction");
    }
}
