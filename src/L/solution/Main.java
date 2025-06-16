package L.solution;

public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.checkout(new CreditCardPayment(), 500); // ✅
        service.checkout(new UPIPayment(), 300);        // ✅
        service.checkout(new CashOnDeliveryPayment(), 700); // ✅
    }
}
