package L.bad_code;

public class CreditCardPayment extends PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}
