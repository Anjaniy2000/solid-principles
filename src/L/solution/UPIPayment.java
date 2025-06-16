package L.solution;

public class UPIPayment implements PrepaidPayment {
    @Override
    public void initiatePayment(double amount) {
        makePayment(amount);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}
