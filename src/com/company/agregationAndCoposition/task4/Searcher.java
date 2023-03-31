package com.company.agregationAndCoposition.task4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Searcher {

    public void searchClientByName(String content, List<Client> clients) {

        List<Client> foundClients = clients.stream()
                .filter(client1 -> client1.getFirstName().equals(content) || client1.getSecondName().equals(content))
                .collect(Collectors.toList());

        if (!(foundClients.size() == 0)) {
            Shower.showClientsList(foundClients);
        } else System.out.println("Matches is not found.");
    }

    public void searchClientsByBalance(CurrencyType currencyType, List<Client> clients,
                                       BigDecimal fromBalance, BigDecimal toBalance) {

        List<Account> foundAccounts = new ArrayList<>();
        Sorter sorter = new Sorter(clients);
        List<Account> accounts = sorter.getAccountsBase().get(currencyType);

        accounts.forEach(account -> {
            BigDecimal currentBalance = account.getBalance();
            if (currentBalance.compareTo(fromBalance) > 0 & currentBalance.compareTo(toBalance) <= 0) {
                foundAccounts.add(account);
            }
        });
        if (foundAccounts.size() == 0) Shower.showIsNoMatches();
        else Shower.showAccountsList(foundAccounts);
    }

    public void searchClientsByBalanceFrom(CurrencyType currencyType, List<Client> clients,
                                           BigDecimal fromBalance) {

        List<Account> foundAccounts = new ArrayList<>();
        Sorter sorter = new Sorter(clients);
        List<Account> accounts = sorter.getAccountsBase().get(currencyType);

        accounts.forEach(account -> {
            BigDecimal currentBalance = account.getBalance();
            if (currentBalance.compareTo(fromBalance) > 0) {
                foundAccounts.add(account);
            }
        });
        if (foundAccounts.size() == 0) Shower.showIsNoMatches();
        else Shower.showAccountsList(foundAccounts);
    }

    public void searchClientsByBalanceTo(CurrencyType currencyType, List<Client> clients,
                                         BigDecimal toBalance) {

        List<Account> foundAccounts = new ArrayList<>();
        Sorter sorter = new Sorter(clients);
        List<Account> accounts = sorter.getAccountsBase().get(currencyType);

        accounts.forEach(account -> {
            BigDecimal currentBalance = account.getBalance();
            if (currentBalance.compareTo(toBalance) <= 0) {
                foundAccounts.add(account);
            }
        });
        if (foundAccounts.size() == 0) Shower.showIsNoMatches();
        else Shower.showAccountsList(foundAccounts);
    }
}