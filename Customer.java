import java.util.Scanner;

class Customer {
    private int numberOfDeposits;
    private int numberOfWithdraws;
    private int accountBalance;

    public Customer() {
        this.numberOfDeposits = 0;
        this.numberOfWithdraws = 0;
        this.accountBalance = 0;
    }

    public void depositMoney(int amountToBeDeposited) {
        accountBalance += amountToBeDeposited;
        numberOfDeposits++;
        System.out.println("Deposited Successfully");
    }

    public void withdrawMoney(int amountToBeWithdrawn) {
        if (amountToBeWithdrawn <= accountBalance) {
            accountBalance -= amountToBeWithdrawn;
            numberOfWithdraws++;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public int getAccountBalance() {
        return accountBalance;
    }
