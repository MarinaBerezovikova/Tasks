package com.company.OOP.task2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Payment {

    private BigDecimal total = new BigDecimal(BigInteger.ZERO);
    private final List<Product> productList = new ArrayList<>();

    static private class Product {

        private final String name;
        private final BigDecimal cost;

        public Product(String name, BigDecimal cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "name: " + name + " cost: " + cost;
        }
    }

    public void addProductToListPurchases(String name, BigDecimal cost) {
        this.productList.add(new Product(name, cost));
    }

    public void calculateTotal() {
        productList.forEach(Product -> total = total.add(Product.cost));
    }

    public void showTheCheck() {
        System.out.println("===================\nList of products:");
        productList.forEach(System.out::println);
        System.out.println("===================\nTotal:" + total);

    }
}
