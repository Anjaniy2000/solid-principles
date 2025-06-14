package S;

public class TransactionService {

    public boolean deposit(float amount, int accountNumber) {
        if(amount > 0 && accountNumber > 0) {
            AccountService accountService = new AccountService();
            Account account = accountService.getAccount(accountNumber);
            account.setTotalAmount(account.getTotalAmount() + amount);
            AccountService.getAccountDB().put(accountNumber, account);
            return true;
        }
        System.out.println("Invalid Amount | Account Number");
        return false;
    }

    public boolean withdraw(float amount, int accountNumber) {
        if(amount > 0 && accountNumber > 0) {
            AccountService accountService = new AccountService();
            Account account = accountService.getAccount(accountNumber);
            if(amount < account.getTotalAmount()) {
                account.setTotalAmount(account.getTotalAmount() - amount);
                AccountService.getAccountDB().put(accountNumber, account);
                return true;
            }
            System.out.println("Insufficient Balance");
            return false;
        }
        System.out.println("Invalid Amount | Account Number");
        return false;
    }
}
