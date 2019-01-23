package datasource;
import databases.ConnectToSqlDB;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
  public class DatabaseOperation {
     static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
     public  static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list,"CNNSearchOptions","options");
    }
    public  static List<String> getItemValue(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("US");
        itemsList.add("World");
        itemsList.add("Opinions");
        itemsList.add("Business");
        itemsList.add("Health");
        itemsList.add("Entertainment");
        itemsList.add("Style");
        itemsList.add("Travel");
        return itemsList;
    }
    public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("CNNSearchOptions", "options");
        return list;
    }
    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
        ConnectToSqlDB.connectToSqlDatabase();
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("CNNSearchOptions","options");
        for(String st:list){
            System.out.println(st);
        }
    }
}





