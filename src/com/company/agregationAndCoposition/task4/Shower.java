package com.company.agregationAndCoposition.task4;

import java.math.BigDecimal;
import java.util.List;

public class Shower {

    public static void showAccountsList(List<Account> accountList) {
        accountList.forEach(System.out::println);
    }

    public static void showClientsList(List<Client> clientList) {
        clientList.forEach(System.out::println);
    }

    public static void showIsNoMatches() {
        System.out.println("Matches is not found.");
    }

    public static void showSumCommonBalances(BigDecimal resultDollarBalance, BigDecimal resultEuroBalance,
                                             BigDecimal resultRubBalance,
                                             BigDecimal deptDollarBalance, BigDecimal deptEuroBalance,
                                             BigDecimal deptRubBalance) {

        System.out.printf("""
                        The total amounts of accounts:
                        By dollar: %s\s
                        By euro: %s
                        By rub: %s

                        The total  of debt amounts:
                        By dollar: %s\s
                        By euro: %s
                        By rub: %s
                        %n""", resultDollarBalance, resultEuroBalance, resultRubBalance, deptDollarBalance,
                deptEuroBalance, deptRubBalance);
    }
}