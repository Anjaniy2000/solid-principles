package L.bad_code;

public class UPIPayment extends PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}
