package DesignPatterns.Factory.V3_AbstractFactory.transaction;

public class RCTTransaction implements Transaction {
    @Override
    public void transaction() {
        System.out.println("RCTTransaction");
    }
}
