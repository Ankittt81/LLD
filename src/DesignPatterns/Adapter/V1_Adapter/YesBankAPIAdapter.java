package DesignPatterns.Adapter.V1_Adapter;

public class YesBankAPIAdapter implements BankAPI {
    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter() {
        yesBankAPI = new YesBankAPI();
    }

    @Override
    public int balance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void deductMoney(int amount) {
        yesBankAPI.transfer(amount);
    }
}
