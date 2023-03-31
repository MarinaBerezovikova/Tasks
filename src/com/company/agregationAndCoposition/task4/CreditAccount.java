package com.company.agregationAndCoposition.task4;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CreditAccount extends Account {

    final private BigDecimal interestRate; // процентная ставка

    public CreditAccount(Client client, CurrencyType currency, BigInteger numberOfAccount,
                         BigDecimal balance, BigDecimal interestRate) {
        super(client, currency, numberOfAccount, balance);
        super.setAccountDebt(balance);
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        String firstName = this.getClient().getFirstName();
        String secondName = this.getClient().getSecondName();
        String currency = this.getCurrency().toString();
        String typeOfAccount = this.getClass().getSimpleName();
        String balance = this.getBalance().toString();
        String interestRate = this.getInterestRate().toString();

        return "\nName: " + firstName + " " + secondName
                + "\nType of account: " + typeOfAccount
                + "\nType of currency: " + currency + "\nBalance: "
                + balance + "\nInterest rate: " + interestRate;
    }

}