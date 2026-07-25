package DesignPatterns.Factory.V3_AbstractFactory;

import DesignPatterns.Factory.V3_AbstractFactory.db.Database;
import DesignPatterns.Factory.V3_AbstractFactory.db.MongDb;
import DesignPatterns.Factory.V3_AbstractFactory.db.MySql;

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
