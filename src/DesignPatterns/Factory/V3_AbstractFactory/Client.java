package DesignPatterns.Factory.V3_AbstractFactory;

import DesignPatterns.Factory.V3_AbstractFactory.databaseComponentFactory.DataBaseComponentFactory;
import DesignPatterns.Factory.V3_AbstractFactory.db.Database;
import DesignPatterns.Factory.V3_AbstractFactory.query.Query;
import DesignPatterns.Factory.V3_AbstractFactory.transaction.Transaction;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String databaseName = input.nextLine();
        Database db= DataBaseFactory.createDataBaseByName(databaseName);

        createUser(db);
    }
    static void createUser(Database db){
      // Query q= db.createQuery();
        //user Operation
       // q.query();
        DataBaseComponentFactory dataBaseComponentFactory= db.createDataBaseComponentFactory();
        Query q=dataBaseComponentFactory.createQuery();
        Transaction t=dataBaseComponentFactory.createTransaction();
        q.query();
        t.transaction();
    }
}


