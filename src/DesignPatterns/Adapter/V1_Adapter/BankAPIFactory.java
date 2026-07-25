package DesignPatterns.Adapter.V1_Adapter;

public class BankAPIFactory {
    public static BankAPI getBankAPIByBankName(String bankName){
        BankAPI bankAPI = null;
       if(bankName.equals("YESBank")){
           bankAPI=new YesBankAPIAdapter();
       }
       else if(bankName.equals("ICICI")){
           bankAPI=new ICICIBankAPIAdapter();
       }
       return bankAPI;
    }
}
