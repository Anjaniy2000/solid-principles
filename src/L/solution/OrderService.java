package L.solution;

public class OrderService {
    public void checkout(PaymentMethod paymentMethod, double amount) {
        paymentMethod.initiatePayment(amount);
    }
}
