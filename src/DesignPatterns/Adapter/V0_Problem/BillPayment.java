package DesignPatterns.Adapter.V0_Problem;

public class BillPayment {
    public void payBill(String billNumber,int amount,YesBankAPI yesBankAPI){
        if(yesBankAPI.getBalance()>=amount){
            yesBankAPI.transfer(amount);
            System.out.println("Payment Successful");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
