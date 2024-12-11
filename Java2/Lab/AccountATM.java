package Java2.Lab;

import java.util.Scanner;

public class AccountATM {
    private int id;
    private double balance;

    // Constructor
    public AccountATM(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter and setter for balance
    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    public void viewBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array of 10 accounts
        AccountATM[] accounts = new AccountATM[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new AccountATM(i + 1, 100); // Initial balance $100 for each account
        }

        while (true) {
            System.out.print("Enter your account id (0 to exit): ");
            int id = sc.nextInt();

            if (id == 0) {
                System.out.println("Exiting the system...");
                break; // Exit the program
            }

            // Validate the account id
            if (id < 1 || id > 10) {
                System.out.println("Invalid id. Please try again.");
                continue;
            }

            // Access the account with the correct id
            AccountATM account = accounts[id - 1];

            while (true) {
                // Display the menu
                System.out.println("\nMain Menu:");
                System.out.println("1. View Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        account.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("Exiting to main menu...\n");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

                // Exit the loop if option 4 was selected
                if (choice == 4) break;
            }
        }
    }
    
}
