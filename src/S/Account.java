package S;


public class Account {
    private int accountNumber;
    private String name;
    private float totalAmount;

    public Account(int accountNumber, String name, float totalAmount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.totalAmount = totalAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
