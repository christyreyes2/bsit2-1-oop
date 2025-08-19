public class BankAccount {
    // This is the Static members
    static String bankName = "Liceo Bank";
    static int totalAccounts;
    static double interestRate = 0.03;
    static int nextAccNumber = 1;

    //This is the Instances members
    String accountNumber = "";
    String accountHolderName = "";
    double balance = 0.00;

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;

        //Print Format
        System.out.printf("Account Created: %s for %s with initial balance: $%.1f%n",
                accountNumber, accountHolderName, initialBalance);
    }

    //This is where you generate Account Number
    public static String generateAccountNumber() {
        return String.format("ACC%03d", nextAccNumber++);
    }

    // This is the Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%s deposited $%.1f. New balance: $%.1f%n",
                    accountHolderName, amount, balance);
        }
    }

    // This is the withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("%s withdrew $%.1f. New balance: $%.1f%n",
                    accountHolderName, amount, balance);
        }
    }

    // This is how you calculate the Interest
    public double calculateInterest() {
        return balance * interestRate;
    }

    // Getting the Account Holder Name
    public String getAccountHolderName() {
        return accountHolderName;
    }
}
