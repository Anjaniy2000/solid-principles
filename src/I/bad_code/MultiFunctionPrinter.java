package I.bad_code;

public class MultiFunctionPrinter implements Printer {
    @Override
    public void print(Document document) {
        System.out.println("Printing: " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning: " + document.getContent());
    }

    @Override
    public void fax(Document document) {
        System.out.println("Faxing: " + document.getContent());
    }
}
