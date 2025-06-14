package I.bad_code;

public class BasicPrinter implements Printer {
    @Override
    public void print(Document document) {
        System.out.println("Printing: " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax(Document document) {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
