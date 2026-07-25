package DesignPatterns.Adapter.V0_Problem;

public class FastTagRecharge {
    public void recharge(int amount,YesBankAPI yesBankAPI){
        if(yesBankAPI.getBalance()>=amount){
            yesBankAPI.transfer(amount);
            System.out.println("Recharge successful");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
