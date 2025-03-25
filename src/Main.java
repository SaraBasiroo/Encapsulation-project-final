public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        SavingsAccount lunaAccount = new SavingsAccount("LS101", "Luna Valdez", 350);
        SavingsAccount victorAccount = new SavingsAccount("VS204", "Victor Cruz", 450);
        SavingsAccount elianaAccount = new SavingsAccount("ES212", "Eliana Torres", 700);
        TransactionAccount thorAccount = new TransactionAccount("TH345", "Thor Odinson", 250);
        TransactionAccount isabelAccount = new TransactionAccount("IT876", "Isabel Garcia", 500);
        TransactionAccount ethanAccount = new TransactionAccount("ET908", "Ethan Hunter", 400);

        bank.addAccount(lunaAccount);
        bank.addAccount(victorAccount);
        bank.addAccount(elianaAccount);
        bank.addAccount(thorAccount);
        bank.addAccount(isabelAccount);
        bank.addAccount(ethanAccount);

        bank.findAccount("ES212");
        bank.findAccount("XT123");

        System.out.println(thorAccount.getBalance());

        thorAccount.deposit(120);
        System.out.println(thorAccount.getBalance());
        lunaAccount.deposit(-15);

        elianaAccount.calculateInterest();
        ethanAccount.calculateInterest();
        System.out.println(elianaAccount.getBalance());
        System.out.println(ethanAccount.getBalance());

        victorAccount.withdraw(320);
        victorAccount.withdraw(380);
        elianaAccount.withdraw(-50);
        isabelAccount.withdraw(900);
        isabelAccount.withdraw(350);
        thorAccount.withdraw(-220);
        bank.showAllBalances();
    }
}
