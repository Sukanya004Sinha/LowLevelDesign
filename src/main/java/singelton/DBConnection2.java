package singelton;
//synchronized Method
public class DBConnection2 {
    public static DBConnection2 conObject;
    private DBConnection2() {
    }
        synchronized public static DBConnection2 getInstance(){
            if(conObject == null){
                conObject = new DBConnection2();
            }
            return conObject;
        }
    }

