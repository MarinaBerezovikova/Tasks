package com.company.OOP.Task2;

import java.math.BigDecimal;

public class Demo {

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.addProductToListPurchases("MILK", new BigDecimal("2.10"));
        payment.addProductToListPurchases("BREAD", new BigDecimal("1.10"));
        payment.calculateTotal();
        payment.showTheCheck();
    }
}
//    BigDecimal MILK = new BigDecimal("2.10");
//    BigDecimal BREAD = new BigDecimal("1.10");
//    BigDecimal MEAT = new BigDecimal("8.00");
//    BigDecimal BEEF = new BigDecimal("7.50");
//    BigDecimal FRUITS_SET = new BigDecimal("5.70");
//    BigDecimal VEGETABLES = new BigDecimal("9.50");
//    BigDecimal EGGS = new BigDecimal("3.05");