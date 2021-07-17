package com.kavinmaha.doubleAndBigdecimals;

public class doubleAndDouble {
    public static void main(String[] args) {
        // 11.06.2021 double and Double examples
        double value1 = 0.02;
        double value2 = 0.03;
        double value3 = value2 - value1;
        System.out.println(value3);

        Double value4 = 0.02;
        Double value5 = 0.03;
        Double value6 = value5 - value4;
        System.out.println(value6);

        System.out.println(value4 <= value5);
        System.out.println(value1 == value2);
    }
}
