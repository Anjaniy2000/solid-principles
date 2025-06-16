package L.bad_code;

public class OrderService {
    public void processOrder(PaymentMethod paymentMethod, double amount) {
        // LSP assumption: All payment methods can make payment
        paymentMethod.makePayment(amount);
    }
}
