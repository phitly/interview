
/// example of broken code : 
///     - problem:
///         - no control over balance
///         - anyone can set it to invalid values
///         - break data interity
class BankAccount {
    private double balance; // Encapsulation: hide balance

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Initial balance can't be negative. Set to 0.");
        }
    }

    public double getBalance() { // Getter
        return balance;
    }

    public void deposit(double amount) { // Controlled setter
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) { // Controlled setter
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        account.withdraw(200); // Will fail validation
        account.withdraw(50);  // Valid
        System.out.println("Balance: " + account.getBalance());
    }
}