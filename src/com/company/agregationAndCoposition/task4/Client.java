package com.company.agregationAndCoposition.task4;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String firstName;
    private String secondName;
    private List<Account> accounts;


    public Client(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Client: " + firstName + " " + secondName + "\nCount of accounts: " + accounts.size() + "\n";
    }
}