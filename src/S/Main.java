package S;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(123456, "Jay Shah", 2000);
        AccountService accountService = new AccountService();
        accountService.addAccount(account);

        account.setTotalAmount(3000);
        accountService.updateAccount(account);

        TransactionService transactionService = new TransactionService();
        transactionService.withdraw(500, account.getAccountNumber());
        transactionService.deposit(100, account.getAccountNumber());

        System.out.println(AccountService.getAccountDB());
    }
}
