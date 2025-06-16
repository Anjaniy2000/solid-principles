package L.solution;

public class CashOnDeliveryPayment implements PostpaidPayment {
    @Override
    public void initiatePayment(double amount) {
        schedulePayment(amount);
    }

    @Override
    public void schedulePayment(double amount) {
        System.out.println("Scheduled ₹" + amount + " for Cash on Delivery.");
    }
}
