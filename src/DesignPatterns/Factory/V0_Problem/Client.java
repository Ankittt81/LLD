package DesignPatterns.Factory.V0_Problem;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String databaseName = input.nextLine();
        Database db=null;
        if(databaseName.equals("mysql")){
            db=new MySql();
        }
        else if(databaseName.equals("mongodb")){
            db=new MongDb();
        }
        createUser(db);
    }
    static void createUser(Database db){
        Query q=null;
        if(db instanceof MySql)  q=new SqlQuery();
        else if(db instanceof MongDb)  q=new NoSqlQuery();

        //user Operation
        q.query();
    }
}

//Problem--
// Doing this if else in createUser increase responsibility
//SRP and OCP violation
