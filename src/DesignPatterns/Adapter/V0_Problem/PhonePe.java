package DesignPatterns.Adapter.V0_Problem;

public class PhonePe {
    private FastTagRecharge fastTagRecharge;
    private BillPayment billPayment;
    private YesBankAPI yesBankAPI;


    public PhonePe(){
        fastTagRecharge = new FastTagRecharge();
        billPayment = new BillPayment();
        yesBankAPI = new YesBankAPI();
    }

    public void rechargeFastTag(int amount){
        fastTagRecharge.recharge(amount,yesBankAPI);
    }

    public void payBill(String billNumber,int amount){
        billPayment.payBill(billNumber,amount,yesBankAPI);
    }

}
// Migrating from YesBank to ICICIBank will require lot of code changes