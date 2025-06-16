package L.bad_code;

public class CashOnDeliveryPayment extends PaymentMethod {
    @Override
    public void makePayment(double amount) {
        throw new UnsupportedOperationException("Payment not supported upfront. Pay on delivery.");
    }
}
