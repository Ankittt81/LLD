package DesignPatterns.Adapter.V1_Adapter;

public interface BankAPI {
    int balance();
    void deductMoney(int amount);
}
