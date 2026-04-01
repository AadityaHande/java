abstract class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }
    
    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;   // allow overdraft
    }
}

public class BankApp {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("Aaditya", 1000);
        CurrentAccount c = new CurrentAccount("Rahul", 500);

        System.out.println("Savings Account:");
        s.deposit(200);
        s.withdraw(300);
        s.display();

        System.out.println("\nCurrent Account:");
        c.deposit(100);
        c.withdraw(700);
        c.display();
    }
}