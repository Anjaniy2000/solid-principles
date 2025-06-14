package D.solution;

public class DataService {
    private Database database;

    public DataService(Database database) {
        this.database = database;
    }

    public void loadData() {
        this.database.connect();
        //load data logic:
    }
}
