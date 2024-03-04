package ATMInterface;

import java.util.*;

// ATM class encapsulating ATM functionalities
class ATM {
    private User currentUser;
    private Scanner scanner;

    public ATM(User currentUser) {
        this.currentUser = currentUser;
        this.scanner = new Scanner(System.in);
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your account balance is: $" + currentUser.getAccountBalance());
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (amount > currentUser.getAccountBalance()) {
            System.out.println("Insufficient funds.");
        } else {
            currentUser.setAccountBalance(currentUser.getAccountBalance() - amount);
            System.out.println("$" + amount + " withdrawn successfully.");
        }
    }

    // Method to deposit money
    public void depositMoney(double amount) {
        currentUser.setAccountBalance(currentUser.getAccountBalance() + amount);
        System.out.println("$" + amount + " deposited successfully.");
    }

    // Method to handle user authentication
    public boolean authenticateUser(int userID, int userPIN) {
        return currentUser.getUserID() == userID && currentUser.getUserPIN() == userPIN;
    }

    // Method to display ATM menu
    public void displayMenu() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to handle user input
    public void handleInput() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdrawMoney(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    depositMoney(depositAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }
}
