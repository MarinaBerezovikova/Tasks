package com.company.agregationAndCoposition.Task4;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DepositaryAccount extends Account {

    private BigDecimal incomePercentage;

    public DepositaryAccount(Client client, CurrencyType currency, BigInteger numberOfAccount,
                             BigDecimal balance, BigDecimal incomePercentage) {
        super(client, currency, numberOfAccount, balance);
        this.incomePercentage = incomePercentage;
    }

    public BigDecimal getIncomePercentage() {
        return incomePercentage;
    }

    public void setIncomePercentage(BigDecimal incomePercentage) {
        this.incomePercentage = incomePercentage;
    }

    @Override
    public String toString() {
        String firstName = this.getClient().getFirstName();
        String secondName = this.getClient().getSecondName();
        String currency = this.getCurrency().toString();
        String typeOfAccount = this.getClass().getSimpleName();
        String balance = this.getBalance().toString();
        String incomePercentage = this.getIncomePercentage().toString();

        return "\nName: " + firstName + " " + secondName
                + "\nType of account: " + typeOfAccount
                + "\nType of currency: " + currency + "\nBalance: "
                + balance + "\nIncome percentage: " + incomePercentage;
    }
}