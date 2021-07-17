package com.kavinmaha.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfExceptions {
    public static void main(String[] args) {
        //16.06.2021 Types of Exceptions
        // Checked Exceptions
        // Will be checked during compile time and exceptions check need to be done
        //FileInputStream fileInputStream = new FileInputStream("src/examples.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream("src/examples.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Unchecked Exceptions
        // Only during runtime, it will be known
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException | NullPointerException | NumberFormatException e) { // Different exceptions can be clubbed together
            // '|' means or
            System.out.println("Number cannot be divided by Zero");
        } finally {          // whatever may be in the try and catch block, finally will be executed
            System.out.println("Cleaning up");
        }

        double result = performDivision(6 , 2);
        System.out.println(result);

    }

    static double performDivision(double a, double b) {
        if (b == 0) {
            throw new MyException("Cannot divide by Zero");
        }
        return a / b;
    }

    static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }

}
