package L.solution;

public interface PostpaidPayment extends PaymentMethod {
    void schedulePayment(double amount);
}
