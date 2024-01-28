import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Account Information");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account ID: ");
                    String accountId = scanner.next();
                    System.out.print("Enter Account Holder Name: ");
                    String holderName = scanner.next();
                    bankingSystem.createAccount(accountId, holderName);
                    break;
                case 2:
                    System.out.print("Enter Account ID: ");
                    accountId = scanner.next();
                    Account account = bankingSystem.searchAccount(accountId);
                    if (account != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                    }
                    break;
                case 3:
                    System.out.print("Enter Account ID: ");
                    accountId = scanner.next();
                    account = bankingSystem.searchAccount(accountId);
                    if (account != null) {
                        System.out.println(account.getAccountInfo());
                    }
                    break;
                case 4:
                    System.out.println("Exiting Banking System...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }
    }
}
