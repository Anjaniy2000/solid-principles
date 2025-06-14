package D.solution;

public class Main {
    public static void main(String[] args) {
        Database mysql = new MySQL();
        DataService service = new DataService(mysql);
        service.loadData();

        Database postgres = new PostgreSQL();
        service = new DataService(postgres);
        service.loadData();

        Database mongoDb = new MongoDB();
        service = new DataService(mongoDb);
        service.loadData();
    }
}

