package singelton;
//eager initialization
public class DBConnection {
    private static DBConnection conObject = new DBConnection();
private DBConnection(){

}
public static DBConnection getInstance(){
    return conObject;
}
public static void main(String[] args){
    DBConnection conObject = DBConnection.getInstance();
}
}
