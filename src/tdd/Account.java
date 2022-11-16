package tdd;

public class Account {

    private int balance;
    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amountWithdrawn) {
      int minimumBalance = 1000;
        if ((minimumBalance + amountWithdrawn) > balance)
            balance = balance;
        if ((amountWithdrawn < balance) && (amountWithdrawn > 0))
            balance = balance - amountWithdrawn;

    }
}

