import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println(account.getAccountHolderName() + " (" + account.getAccountNumber() + ") : Balance: " + account.getBalance());
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println(account.getAccountHolderName() + " (" + account.getAccountNumber() + ") : Balance: " + account.getBalance());
        }
    }
}
