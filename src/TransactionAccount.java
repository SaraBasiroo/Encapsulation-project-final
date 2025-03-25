public class TransactionAccount extends BankAccount {
    private final double overdraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest applied for Current Account");
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Current Account " + getAccountNumber());
        } else {
            System.out.println("You exceeds overdraft limit!");
        }
    }
}
