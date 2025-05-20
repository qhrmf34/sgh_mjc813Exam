package com.mjc.mjc813.cal;

public class Account {
    private String accoutNumber;
    private String accountName;
    private int balance;

    
    public Account(String accountNumber, String accountName, int balance) {
        this.accoutNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    void addMoney(int m) {
        this.balance += m;
    }

    void subMoney(int m) {
        this.balance -= m;
    }

    public String getAccountNumber() {
        return accoutNumber;
    }

    public void setAccoutNumber(String accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
