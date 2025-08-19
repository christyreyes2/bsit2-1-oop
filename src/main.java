public class main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: 3.0%\n");

        // Creation of Accounts
        BankAccount acc1 = new BankAccount("John Doe", 1000.0);
        BankAccount acc2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount acc3 = new BankAccount("Bob Johnson", 500.0);

        // This is just for spacing
        System.out.println();


        //Format for Account Operation
        System.out.println("═══ Account Operations ═══");
        acc1.deposit(500.0);
        acc2.withdraw(300.0);

        // This is just for Spacing
        System.out.println();


        //Format for Interest Calculation
        System.out.println("═══ Interest Calculation ═══");
        System.out.printf("%s's interest: $%.1f%n", acc1.getAccountHolderName(), acc1.calculateInterest());
        System.out.printf("%s's interest: $%.1f%n", acc2.getAccountHolderName(), acc2.calculateInterest());
        System.out.printf("%s's interest: $%.1f%n", acc3.getAccountHolderName(), acc3.calculateInterest());

        //The Total Account Created
        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}