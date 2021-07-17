package com.kavinmaha.datastructures;

import java.util.Arrays;

public class WorkingWithArrays {
    //06.06.2021 - Arrays
    public static void main(String[] args) {
        int[] numbers = {1, 50, 36, 99};
        numbers[3] = 100;
        System.out.println(numbers[1]);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
