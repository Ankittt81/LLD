package DesignPatterns.Adapter.V1_Adapter;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private BillPayment billPayment;
    private BankAPI bankAPI;


    public PhonePe(BankAPI bankAPI){
        fastTagRecharge = new FastTagRecharge();
        billPayment = new BillPayment();
        this.bankAPI = bankAPI;
    }

    public void rechargeFastTag(int amount){
        fastTagRecharge.recharge(amount,bankAPI);
    }

    public void payBill(String billNumber,int amount){
        billPayment.payBill(billNumber,amount,bankAPI);
    }
}
