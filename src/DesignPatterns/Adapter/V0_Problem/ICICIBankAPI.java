package DesignPatterns.Adapter.V0_Problem;

public class ICICIBankAPI {

    public int checkBalance(){
        System.out.println("Checking Balance via ICICI Bank");
        return 100;
    }

    public void transfer(int amount){
        System.out.println("Transferring money via ICICI Bank");
    }
}
