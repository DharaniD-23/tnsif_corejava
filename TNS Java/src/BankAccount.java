
public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with only account number
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Constructor with account number and holder name
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    // Full initialization constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Creating a bank account with only account number
        BankAccount account1 = new BankAccount(123456789, "Sudha");
        System.out.println("Account 1 - Account Number: " + account1.getAccountNumber());

        // Creating a bank account with account number and holder name
        BankAccount account2 = new BankAccount(987564562, "Dharani");
        System.out.println("Account 2 - Account Number: " + account2.getAccountNumber() + ", Holder Name: " + account2.getAccountHolderName());

        // Creating a bank account with full initialization
        BankAccount account3 = new BankAccount(456789123, "Devi", 1000.0);
        System.out.println("Account 3 - Account Number: " + account3.getAccountNumber() + ", Holder Name: " + account3.getAccountHolderName() + ", Balance: $" + account3.getBalance());
    }
}


	











