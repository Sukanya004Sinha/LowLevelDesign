package singelton;

public class DBConnection4 {
    private static volatile  DBConnection4 conObject;

    private DBConnection4() {

    }

    public static DBConnection4 getInstance() {
        if (conObject == null) {
            synchronized (DBConnection4.class) {
                if (conObject == null) {
                    conObject = new DBConnection4();
                }
            }
        }
        return conObject;
    }
}
