package ChatGPT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully to account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }
}

public class BankingSystem {
    private Map<String, Account> accounts;

    public BankingSystem() {
        this.accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            Account account = new Account(accountNumber);
            accounts.put(accountNumber, account);
            System.out.println("Account " + accountNumber + " created successfully.");
        } else {
            System.out.println("Account " + accountNumber + " already exists.");
        }
    }

    public String pay(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            return amount + " paid to account " + accountNumber;
        } else {
            return "Account " + accountNumber + " does not exist.";
        }
    }

    public String withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            return amount + " withdrawn from account " + accountNumber;
        } else {
            return "Account " + accountNumber + " does not exist.";
        }
    }

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        // Sample queries
        String[][] queries = {
            {"CREATE_ACCOUNT", "1", "account1"},
            {"PAY", "8", "account1", "200"}
        };

        List<String> output = new ArrayList<>();

        for (String[] query : queries) {
            switch (query[0]) {
                case "CREATE_ACCOUNT":
                    bankingSystem.createAccount(query[2]);
                    output.add("Account " + query[2] + " created successfully.");
                    break;
                case "PAY":
                    String paymentResult = bankingSystem.pay(query[2], Double.parseDouble(query[3]));
                    output.add(paymentResult);
                    break;
                default:
                    output.add("Invalid query.");
            }
        }

        // Print the output array
        System.out.println("Output:");
        for (String result : output) {
            System.out.println(result);
        }
    }
}
