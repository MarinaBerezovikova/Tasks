package com.company.agregationAndCoposition.Task4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        BankWorker bankWorker = new BankWorker();

        // создание листа, где будут храниться все клиенты
        System.out.println("Создаем лист, где будут находиться все клиенты");
        List<Client> clientList = new ArrayList<>();

        // создание нулевого клиента и его счета
        System.out.println("Создаем четырех клиентов и их счета");
        bankWorker.createAClient("Hue", "Milton", clientList);

        bankWorker.createCurrentAccount(clientList.get(0), CurrencyType.DOLLAR, new BigInteger("455878999921465"),
                new BigDecimal("1000.00"));
        bankWorker.createCurrentAccount(clientList.get(0), CurrencyType.EURO, new BigInteger("422878922921465"),
                new BigDecimal("1000.00"));
        bankWorker.createCreditAccount(clientList.get(0), CurrencyType.RUB, new BigInteger("456878822921465"),
                new BigDecimal("10000.00"), new BigDecimal("5.00"));

        // создание первого клиента и его счетов
        bankWorker.createAClient("John", "Hue", clientList);

        bankWorker.createCurrentAccount(clientList.get(1), CurrencyType.DOLLAR, new BigInteger("456878546921465"),
                new BigDecimal("100.00"));

        bankWorker.createDepositaryAccount(clientList.get(1), CurrencyType.RUB, new BigInteger("456878545521465"),
                new BigDecimal("50000.00"), new BigDecimal("5.00"));

        bankWorker.createCreditAccount(clientList.get(1), CurrencyType.RUB, new BigInteger("456878533321465"),
                new BigDecimal("50000.00"), new BigDecimal("3.00"));


        // создание второго клиента и его счетов
        bankWorker.createAClient("Donald", "Bunch", clientList);

        bankWorker.createCurrentAccount(clientList.get(2), CurrencyType.DOLLAR, new BigInteger("45687854655555"),
                new BigDecimal("500.00"));

        bankWorker.createCurrentAccount(clientList.get(2), CurrencyType.RUB, new BigInteger("456878545528885"),
                new BigDecimal("100000.00"));

        bankWorker.createCurrentAccount(clientList.get(2), CurrencyType.EURO, new BigInteger("456878545527777"),
                new BigDecimal("1000.00"));

        bankWorker.createCurrentAccount(clientList.get(2), CurrencyType.DOLLAR, new BigInteger("456555545528885"),
                new BigDecimal("400.00"));

        bankWorker.createCreditAccount(clientList.get(2), CurrencyType.RUB, new BigInteger("456878545528885"),
                new BigDecimal("500000.00"), new BigDecimal("4.00"));

        bankWorker.createCurrentAccount(clientList.get(2), CurrencyType.EURO, new BigInteger("456878545527799"),
                new BigDecimal("1600.00"));

        System.out.println("---");
        System.out.println("Пробуем блокировать аккаунт второго клиента");
        // блокировка счета в долларах второго клиента

        System.out.println("The account of Donald Bunch is blocked? It's " + clientList.get(2).getAccounts().get(0).getIsBlocked());
        bankWorker.blockTheAccount(clientList.get(2), 0);
        System.out.println("The account of Donald Bunch is blocked? It's " + clientList.get(2).getAccounts().get(0).getIsBlocked());

        // разблокировка
        bankWorker.unblockTheAccount(clientList.get(2), 0);
        System.out.println(" We did unblock the account. The account of Donald Bunch is blocked? It's " + clientList.get(2).getAccounts().get(0).getIsBlocked());

        // блокировка текущего счета в рублях второго клиента
        bankWorker.blockTheAccount(clientList.get(2), 1);
        bankWorker.unblockTheAccount(clientList.get(2), 1);

        System.out.println("---");
        System.out.println("Создаем сортировщик и базу для сортировки");

        // создание сортировщика и его базы
        Sorter sorter = new Sorter(clientList);

        System.out.println("---");
        System.out.println("Отсортировали аккаунты по типу валюты");
        sorter.sortAccountsByBalanceSpecifiedCurrency(CurrencyType.RUB);

        System.out.println("---");
        System.out.println("Отсортировали аккаунты по типу счета (текущий)");
        sorter.catchAccountsByType("CurrentAccount");

        System.out.println("---");
        System.out.println("Пробуем найти клиента по cлову Hue");
        Searcher searcher = new Searcher();
        searcher.searchClientByName("Hue", clientList);

        System.out.println("---");
        System.out.println("Пробуем найти клиента или клиентов по валюте (доллар) и заданному промежутку баланса(450 - 600)");
        searcher.searchClientsByBalance(CurrencyType.DOLLAR, clientList, new BigDecimal("450"), new BigDecimal("600"));

        System.out.println("---");
        System.out.println("Пробуем найти клиента или клиентов по валюте (рубль) и заданному промежутку баланса(10000 - 100000)");
        searcher.searchClientsByBalance(CurrencyType.RUB, clientList, new BigDecimal("10000"), new BigDecimal("100000"));

        System.out.println("---");
        System.out.println("Пробуем найти клиента или клиентов по валюте (рубль) и балансу от (20000)");
        searcher.searchClientsByBalanceFrom(CurrencyType.RUB, clientList, new BigDecimal("100000"));

        System.out.println("---");
        System.out.println("Пробуем найти клиента или клиентов по валюте (рубль) и балансу до (20000)");
        searcher.searchClientsByBalanceTo(CurrencyType.RUB, clientList, new BigDecimal("20000"));

        System.out.println("---");
        System.out.println("Пробуем подсчитать общий баланс по всем клиентам, а также задолженности");
        Calculator calculator = new Calculator();
        calculator.calculateCommonBalanceByClients(clientList);
    }
}