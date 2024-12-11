package Java2.Lab;

public class Account {
    // Private data fields
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    // No-arg constructor
    public Account() {}

    // Constructor with ID and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // Accessors (Getters)
    public int getId() { return id; }
    public double getBalance() { return balance; }
    public double getAnnualInterestRate() { return annualInterestRate; }

    // Mutators (Setters) with validation for positive values
    public boolean setId(int id) {
        if (id > 0) {
            this.id = id;
            return true;
        }
        return false;
    }

    public boolean setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            return true;
        }
        return false;
    }

    public boolean setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate >= 0) {
            this.annualInterestRate = annualInterestRate;
            return true;
        }
        return false;
    }

    // Method to withdraw an amount from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // Method to deposit an amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Calculate monthly interest
    public double getMonthlyInterest() {
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        return balance * monthlyInterestRate;
    }

    // Method to print account details
    @Override
    public String toString() {
        return "Account ID: " + id +
                "\nBalance: $" + balance +
                "\nAnnual Interest Rate: " + annualInterestRate + "%";
    }

    public static void main(String[] args) {
            // Create an account with ID 1122, balance of $20,000, annual interest rate of 4.5%
            Account account = new Account(1122, 20000);
            account.setAnnualInterestRate(4.5);
    
            System.out.println("Initial Account Details:");
            System.out.println(account);
    
            // Withdraw $2,500
            if (account.withdraw(2500)) {
                System.out.println("\nWithdrawal of $2,500 successful.");
            } else {
                System.out.println("\nWithdrawal of $2,500 failed.");
            }
    
            // Deposit $3,000
            account.deposit(3000);
            System.out.println("\nDeposit of $3,000 successful.");
    
            // Print updated balance and monthly interest
            System.out.println("\nUpdated Account Details:");
            System.out.println(account);
    
            System.out.printf("\nMonthly Interest: $%.2f%n", account.getMonthlyInterest());
    }
}
