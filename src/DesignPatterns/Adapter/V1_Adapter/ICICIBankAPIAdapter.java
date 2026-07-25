package DesignPatterns.Adapter.V1_Adapter;

public class ICICIBankAPIAdapter implements BankAPI {
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAPIAdapter() {
        iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public int balance() {
        return iciciBankAPI.checkBalance();
    }

    @Override
    public void deductMoney(int amount) {
        iciciBankAPI.transfer(amount);
    }
}
