package com.company.agregationAndCoposition.Task4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public abstract class Account {

    final private BigInteger numberOfAccount;
    private BigDecimal balance;
    private BigDecimal accountDebt;
    final private CurrencyType currency;
    final private Client client;
    private boolean isBlocked;


    public Account(Client client, CurrencyType currency, BigInteger numberOfAccount, BigDecimal balance) {
        this.client = client;
        this.currency = currency;
        this.numberOfAccount = numberOfAccount;
        this.balance = balance.setScale(2, RoundingMode.DOWN);
        this.accountDebt = new BigDecimal("0.00");
        this.isBlocked = false;
    }

    public BigInteger getNumberOfAccount() {
        return numberOfAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public Client getClient() {
        return client;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public BigDecimal getAccountDebt() {
        return accountDebt;
    }

    public void setAccountDebt(BigDecimal accountDebt) {
        this.accountDebt = accountDebt;
    }
}