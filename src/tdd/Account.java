package tdd;

public class Account {

    int balance;

    public void deposit(int amount) {
        if (amount < 1) {
            amount = 0;
        }
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount < 0) {
        } else if (amount > balance) {

        } else balance = balance - amount;

    }

    }