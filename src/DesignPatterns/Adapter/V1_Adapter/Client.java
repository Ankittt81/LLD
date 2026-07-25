package DesignPatterns.Adapter.V1_Adapter;

import java.util.Scanner;

public class Client {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Bank Name!");
        String bankName = sc.nextLine();
        BankAPI bankAPI=BankAPIFactory.getBankAPIByBankName(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.payBill("ABC",50);
        phonePe.rechargeFastTag(120);
    }
}
