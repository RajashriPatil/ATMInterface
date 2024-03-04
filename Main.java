package ATMInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = new User(123456, 7890, 1000.0);

        // Create ATM instance with the user
        ATM atm = new ATM(user);

        // Prompt user for authentication
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your User ID: ");
        int userID = scanner.nextInt();
        System.out.print("Enter your PIN: ");
        int userPIN = scanner.nextInt();

        // Authenticate user
        if (atm.authenticateUser(userID, userPIN)) {
            // If authenticated, display ATM menu and handle user input
            atm.handleInput();
        } else {
            System.out.println("Invalid User ID or PIN. Exiting...");
        }
    }
}