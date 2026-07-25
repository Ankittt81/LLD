package DesignPatterns.Adapter.V0_Problem;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe();
        phonePe.payBill("ABC",50);
        phonePe.rechargeFastTag(120);
    }
}
