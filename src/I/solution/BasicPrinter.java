package I.solution;

public class BasicPrinter implements Print {

    @Override
    public void print(Document document) {
        System.out.println("Printing: " + document.getContent());
    }
}
