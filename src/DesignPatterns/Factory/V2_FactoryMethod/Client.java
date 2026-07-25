package DesignPatterns.Factory.V2_FactoryMethod;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String databaseName = input.nextLine();
        Database db= DataBaseFactory.createDataBaseByName(databaseName);

        createUser(db);
    }
    static void createUser(Database db){
       Query q= db.createQuery();
        //user Operation
        q.query();
    }
}


