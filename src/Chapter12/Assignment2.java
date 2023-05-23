package Chapter12;

public class Assignment2 {
    public static void main(String[] args) {
        BankAccount ac = new BankAccount();
        ac.setBalance(0);
        ac.deposit(10000);
        System.out.println("잔액 : " + ac.getBalance());
        ac.withdraw(8000);
        System.out.println("잔액 : " + ac.getBalance());
    }
}

class BankAccount {
    private int accountNumber;
    private String owner;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
