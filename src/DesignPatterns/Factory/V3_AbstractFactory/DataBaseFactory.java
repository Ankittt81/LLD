package DesignPatterns.Factory.V2_FactoryMethod;

public class DataBaseFactory {

    public static Database createDataBaseByName(String databaseName){
        Database db=null;
        if(databaseName.equals("mysql")){
            db=new MySql();
        }
        else if(databaseName.equals("mongodb")){
            db=new MongDb();
        }
        return db;
    }
}
