public abstract class BankAccount {
    private String accountHolderName;
    private final String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public abstract void calculateInterest();

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Money withdrawn from " + accountNumber);}
        else if (amount<0) {
            System.out.println("Invalid amount input.");
        }
        else{
            System.out.println("Not enough balance!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " Money deposited into " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
