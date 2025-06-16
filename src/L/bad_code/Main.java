package L.bad_code;

public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.processOrder(new CreditCardPayment(), 500); // ✅
        service.processOrder(new UPIPayment(), 300);        // ✅
        service.processOrder(new CashOnDeliveryPayment(), 700); // ❌ RUNTIME ERROR!
    }
}
