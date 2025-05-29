package singelton;
//lazy initialization
public class DBConnection1 {
    private static DBConnection1 canObject = null;
    private DBConnection1() {
        // private constructor to prevent instantiation
    }
    private static DBConnection1 getInstance(){
        if(canObject ==null){
            canObject = new DBConnection1();
        }
    return canObject;
    }
}
