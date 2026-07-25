package DesignPatterns.Adapter.V1_Adapter;

public class BillPayment {
    public void payBill(String billNumber, int amount,BankAPI bankAPI) {
        if(bankAPI.balance()>=amount){
            bankAPI.deductMoney(amount);
            System.out.println("Payment Successful");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
