package com.company.agregationAndCoposition.task4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class BankWorker {

    Account account;
    Client client;

    public void createAClient(String name, String secondName, List<Client> clients) {
        client = new Client(name, secondName);
        clients.add(client);
    }

    // Creating accounts and adding to account list
    public void createCurrentAccount(Client client, CurrencyType currency, BigInteger numberOfAccount,
                                     BigDecimal balance) {
        account = new CurrentAccount(client, currency, numberOfAccount, balance);
        client.getAccounts().add(account);
    }

    public void createCreditAccount(Client client, CurrencyType currency, BigInteger numberOfAccount,
                                    BigDecimal balance, BigDecimal interestRate) {

        account = new CreditAccount(client, currency, numberOfAccount, balance, interestRate);
        client.getAccounts().add(account);
    }

    public void createDepositaryAccount(Client client, CurrencyType currency, BigInteger numberOfAccount,
                                        BigDecimal balance, BigDecimal incomePercentage) {

        account = new DepositaryAccount(client, currency, numberOfAccount, balance, incomePercentage);
        client.getAccounts().add(account);
    }

    void blockTheAccount(Client client, int accountNumber) {
        account = client.getAccounts().get(accountNumber);
        account.setIsBlocked(true);
    }

    void unblockTheAccount(Client client, int accountNumber) {
        account = client.getAccounts().get(accountNumber);
        account.setIsBlocked(false);
    }
}