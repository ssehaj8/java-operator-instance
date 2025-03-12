class BankAccount {
    private static String bankName = "Central Bank";
    private static int totalAccounts;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    // Method to display bank account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }

    // Method to display total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        System.out.println("Bank Details:");

        BankAccount account1 = new BankAccount(101, "Alice", 500000);
        account1.displayAccountDetails();

        BankAccount account2 = new BankAccount(102, "Charlie", 400000);
        account2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}

/*
Output:
    Bank Details:
    Bank Name: Central Bank
    Account Number: 101
    Account Holder: Alice
    Balance: 500000.0
    Bank Name: Central Bank
    Account Number: 102
    Account Holder: Charlie
    Balance: 400000.0
    Total Bank Accounts: 2
 */