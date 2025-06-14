package I.solution;


public class Main {
    public static void main(String[] args) {
        Document document = new Document("Hello There");
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print(document);

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print(document);
        multiFunctionPrinter.scan(document);
        multiFunctionPrinter.fax(document);
    }
}
