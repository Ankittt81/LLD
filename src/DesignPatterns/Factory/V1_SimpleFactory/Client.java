package DesignPatterns.Factory.V1_SimpleFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String databaseName = input.nextLine();
        Database db=DataBaseFactory.createDataBaseByName(databaseName);

        createUser(db);
    }
    static void createUser(Database db){
       Query q=QueryFactory.createQuery(db);
        //user Operation
        q.query();
    }
}


