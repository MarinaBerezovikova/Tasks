package com.company.agregationAndCoposition.Task4;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CurrentAccount extends Account {

    public CurrentAccount(Client client, CurrencyType currency, BigInteger numberOfAccount, BigDecimal balance) {
        super(client, currency, numberOfAccount, balance);
    }

    @Override
    public String toString() {
        String firstName = this.getClient().getFirstName();
        String secondName = this.getClient().getSecondName();
        String typeOfAccount = this.getClass().getSimpleName();
        String currency = this.getCurrency().toString();
        String balance = this.getBalance().toString();
        String accountDebt = this.getAccountDebt().toString();

        return "\nName: " + firstName + " " + secondName
                + "\nType of account: " + typeOfAccount
                + "\nType of currency: " + currency
                + "\nBalance: " + balance
                + "\nAccount debt: " + accountDebt;
    }
}