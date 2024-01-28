import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
    private Map<String, Account> accounts = new HashMap<>();

    // Create a new account
    public void createAccount(String accountId, String holderName) {
        if (!accounts.containsKey(accountId)) {
            Account newAccount = new Account(accountId, holderName);
            accounts.put(accountId, newAccount);
            System.out.println("Account created successfully for " + holderName);
        } else {
            System.out.println("Account with ID " + accountId + " already exists.");
        }
    }

    // Search for an account by ID
    public Account searchAccount(String accountId) {
        if (accounts.containsKey(accountId)) {
            return accounts.get(accountId);
        } else {
            System.out.println("Account with ID " + accountId + " not found.");
            return null;
        }
    }
}
