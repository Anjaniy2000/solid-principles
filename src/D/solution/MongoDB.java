package D.solution;

public class MongoDB implements Database {

    @Override
    public void connect() {
        System.out.println("Connected to MongoDB DB");
    }
}
