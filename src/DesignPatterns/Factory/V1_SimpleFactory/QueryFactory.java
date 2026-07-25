package DesignPatterns.Factory.V1_SimpleFactory;

public class QueryFactory {
    public static Query createQuery(Database db){
        Query q=null;
        if(db instanceof MySql)  q=new SqlQuery();
        else if(db instanceof MongDb)  q=new NoSqlQuery();
        return q;
    }
}
