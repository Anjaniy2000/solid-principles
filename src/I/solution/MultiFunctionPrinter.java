package I.solution;


public class MultiFunctionPrinter implements Print, Scan, Fax {

    @Override
    public void fax(Document document) {
        System.out.println("Faxing: " + document.getContent());
    }

    @Override
    public void print(Document document) {
        System.out.println("Printing: " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning: " + document.getContent());
    }
}
