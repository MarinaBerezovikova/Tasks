package com.company.agregationAndCoposition.Task4;

import java.util.*;


public class Sorter {

    private Map<CurrencyType, ArrayList<Account>> accountsBase;
    List<Account> clientAccounts;
    CurrencyType currencyType;

    public Map<CurrencyType, ArrayList<Account>> getAccountsBase() {
        return accountsBase;
    }

    public Sorter(List<Client> clientList) {
        createTheAccountsBase(clientList);
    }

    private static final Comparator<Account> COMPARE_BY_BALANCE =
            Comparator.comparing(Account::getBalance);

    public void sortAccountsByBalanceSpecifiedCurrency(CurrencyType type) {
        List<Account> clientAccounts = this.accountsBase.get(type);
        clientAccounts.sort(COMPARE_BY_BALANCE);
        Shower.showAccountsList(clientAccounts);
    }


    // сортировка по типу аккаунта
    public void catchAccountsByType(String accountType) {

        ArrayList<Account> accounts;
        List<Account> result = new ArrayList<>();
        for (Map.Entry<CurrencyType, ArrayList<Account>> entry : accountsBase.entrySet()) {
            accounts = entry.getValue();
            accounts.forEach(account -> {
                String temp = account.getClass().getSimpleName();
                if (temp.equals(accountType)) {
                    result.add(account);
                }
            });
        }
        Shower.showAccountsList(result);
    }

    /**
     * приватные методы помощники
     */
    private static ArrayList<Account> addAccountToList(ArrayList<Account> array, Account account) {
        array.add(account);
        return array;
    }

    // создаю мап базу, вызываю метод в конструкторе
    private void createTheAccountsBase(List<Client> clientList) {

        accountsBase = new HashMap<>();

        accountsBase.put(CurrencyType.RUB, new ArrayList<>());
        accountsBase.put(CurrencyType.DOLLAR, new ArrayList<>());
        accountsBase.put(CurrencyType.EURO, new ArrayList<>());

        clientList.forEach((Client) -> {
                    clientAccounts = Client.getAccounts();
                    clientAccounts.forEach((Account) -> {
                        currencyType = Account.getCurrency();
                        if (currencyType.compareTo(CurrencyType.RUB) <= 0) {
                            accountsBase.put(CurrencyType.RUB, addAccountToList(accountsBase.get(CurrencyType.RUB), Account));
                        } else if (currencyType.compareTo(CurrencyType.EURO) <= 0) {
                            accountsBase.put(CurrencyType.EURO, addAccountToList(accountsBase.get(CurrencyType.EURO), Account));
                        } else {
                            accountsBase.put(CurrencyType.DOLLAR, addAccountToList(accountsBase.get(CurrencyType.DOLLAR), Account));
                        }
                    });
                }
        );
    }
}