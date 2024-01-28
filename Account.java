public class Account {
    private String accountId;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(String accountId, String accountHolderName) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0; // Initial balance is set to 0
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Get Account Information
    public String getAccountInfo() {
        return "Account ID: " + accountId + ", Holder: " + accountHolderName + ", Balance: " + balance;
    }

    // Getter for Account ID
    public String getAccountId() {
        return accountId;
    }
}
