package com.company.agregationAndCoposition.task4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calculator {

    public void calculateCommonBalanceByClients(List<Client> clientList) {

        Sorter newSorter = new Sorter(clientList);
        Map<CurrencyType, ArrayList<Account>> accountBase = newSorter.getAccountsBase();

        BigDecimal resultDollarBalance = accountBase.get(CurrencyType.DOLLAR)
                .stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal resultEuroBalance = accountBase.get(CurrencyType.EURO)
                .stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal resultRubBalance = accountBase.get(CurrencyType.RUB)
                .stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal deptDollarBalance = accountBase.get(CurrencyType.DOLLAR)
                .stream()
                .map(Account::getAccountDebt)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal deptEuroBalance = accountBase.get(CurrencyType.EURO)
                .stream()
                .map(Account::getAccountDebt)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal deptRubBalance = accountBase.get(CurrencyType.RUB)
                .stream()
                .map(Account::getAccountDebt)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        Shower.showSumCommonBalances(resultDollarBalance, resultEuroBalance, resultRubBalance, deptDollarBalance,
                deptEuroBalance, deptRubBalance);
    }
}