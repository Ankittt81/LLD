package DesignPatterns.Factory.V3_AbstractFactory;

public class RCTTransaction implements Transaction{
    @Override
    public void transaction() {
        System.out.println("RCTTransaction");
    }
}
