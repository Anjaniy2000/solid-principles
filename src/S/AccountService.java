package S;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private static Map<Integer, Account> accountDB = new HashMap<>();

    public boolean addAccount(Account account) {
        if(account.getAccountNumber() > 0 && !account.getName().isBlank() && account.getTotalAmount() >= 1000) {
            accountDB.put(account.getAccountNumber(), account);
            return true;
        }
        System.out.println("Invalid Account Number | Name | Total Amount");
        return false;
    }

    public Account getAccount(int id) {
        if(id > 0) {
            return accountDB.get(id);
        }
        System.out.println("Invalid Account Number");
        return null;
    }

    public boolean updateAccount(Account account) {
        if(account.getAccountNumber() > 0) {
            accountDB.put(account.getAccountNumber(), account);
            return true;
        }
        System.out.println("Invalid Account Number");
        return false;
    }

    public static Map<Integer, Account> getAccountDB() {
        return accountDB;
    }

    //bad code : not following S(single responsibility principle)
    public void deposit(float amount, int accountNumber) {
        //deposit logic:
    }
}
