package Masking;

import java.util.ArrayList;
import java.util.List;

// Bank class
class Bankk {
    String name;
    List<Account> accounts;  // Accounts linked to this bank

    Bankk(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    
    // Add an account to the bank
    void addAccount(Account account) {
        accounts.add(account);
    }

    // Show all users in this bank
    void showUsers() {
        System.out.println("Users in Bank: " + name);
        for (Account acc : accounts) {
            System.out.println("- " + acc.user.name + " (Balance: " + acc.balance + ")");
        }
        System.out.println();
    }
}

// User class
class Userr {
    String name;
    List<Account> accounts;  // Accounts linked to this user

    Userr(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add an account to the user
    void addAccount(Account account) {
        accounts.add(account);
    }

    // Show all banks of this user
    void showBanks() {
        System.out.println("Banks of User: " + name);
        for (Account acc : accounts) {
            System.out.println("- " + acc.bank.name + " (Balance: " + acc.balance + ")");
        }
        System.out.println();
    }
}

// Account class linking User and Bank
class Account {
    Userr user;
    Bankk bank;
    double balance;

    Account(Userr u, Bankk b, double balance) {
        this.user = u;
        this.bank = b;
        this.balance = balance;

        // Link account to user and bank
        u.addAccount(this);
        b.addAccount(this);
    }
}

// Main class
public class Model_based_relation {
    public static void main(String[] args) {

        // Create banks
        Bankk sbi = new Bankk("SBI");
        Bankk icici = new Bankk("ICICI");

        // Create users
        Userr ram = new Userr("Ram");
        Userr shyam = new Userr("Shyam");

        // Create accounts (link user & bank)
        new Account(ram, sbi, 5000);
        new Account(ram, icici, 10000);
        new Account(shyam, sbi, 7000);

        // Show banks for each user
        ram.showBanks();
        shyam.showBanks();

        // Show users for each bank
        sbi.showUsers();
        icici.showUsers();
    }
}

