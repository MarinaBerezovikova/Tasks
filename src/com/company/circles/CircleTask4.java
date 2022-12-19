package com.company.circles;

import java.math.BigInteger;

public class CircleTask4 {

    public static void main(String[] args) {

        BigInteger numbersResult = BigInteger.valueOf(1);

        for (int value = 1; value <= 200; value++) {

            BigInteger bigValue = BigInteger.valueOf(value);

            BigInteger squareOfNumber = bigValue.multiply(bigValue);
            numbersResult = squareOfNumber.multiply(numbersResult);

        }
        System.out.println(numbersResult);
    }
}


//(int x = startNumber.intValue(); x <= 200; startNumber.add(BigInteger.valueOf(1)))
//        (int turn = 1; turn <= 200; turn++)