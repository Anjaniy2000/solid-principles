package D.bad_code;

public class DataService {

    //bad code : directly depends on MySQLDatabase (Violation of DIP)
    private final MySQLDatabase database = new MySQLDatabase();

    public void loadData() {
        database.connect();
        //load data logic:
    }
}
