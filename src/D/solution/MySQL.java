package D.solution;

public class MySQL implements Database {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL DB");
    }
}
