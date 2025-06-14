package D.solution;

public class PostgreSQL implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL DB");
    }
}
