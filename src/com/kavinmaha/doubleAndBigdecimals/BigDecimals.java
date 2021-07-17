package com.kavinmaha.doubleAndBigdecimals;

import java.math.BigDecimal;

public class BigDecimals {
    public static void main(String[] args) {
        // 11.06.2021 BigDecimal
        BigDecimal numberOne = new BigDecimal("0.02");
        BigDecimal numberTwo = new BigDecimal("0.02");
        BigDecimal result = numberTwo.subtract(numberOne);
        System.out.println(result);
        // Comparison : -1 is < , 0 is = , 1 is >
        if (numberTwo.compareTo(numberOne) == 0){
            System.out.println("Hey..Numbers are Equal");
        }
        System.out.println(numberTwo.compareTo(numberOne));
    }
}
