package ATMInterface;

import java.util.Scanner;

// User class to represent each user of the ATM
class User {
    private int userID;
    private int userPIN;
    private double accountBalance;

    public User(int userID, int userPIN, double accountBalance) {
        this.userID = userID;
        this.userPIN = userPIN;
        this.accountBalance = accountBalance;
    }

    public int getUserID() {
        return userID;
    }

    public int getUserPIN() {
        return userPIN;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
