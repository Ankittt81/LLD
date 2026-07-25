package DesignPatterns.Adapter.V1_Adapter;

public class FastTagRecharge {
    public void recharge(int amount,BankAPI bankAPI) {
        if(bankAPI.balance()>=amount){
            bankAPI.deductMoney(amount);
            System.out.println("Recharge successful");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
