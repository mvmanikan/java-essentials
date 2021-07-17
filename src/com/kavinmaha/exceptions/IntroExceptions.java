package com.kavinmaha.exceptions;

public class IntroExceptions {
    public static void main(String[] args) {
        // 16.06.2021 Exceptions
//        var name = "Mani";
        String name = null;
        try{
            System.out.println(name.length());
        } catch (NullPointerException e){
            System.out.println("Name is null " + e);
        }
    }
}
