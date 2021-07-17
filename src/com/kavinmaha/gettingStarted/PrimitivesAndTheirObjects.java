package com.kavinmaha.gettingStarted;

import com.sun.jdi.LongValue;

import java.util.ArrayList;
import java.util.List;

public class PrimitivesAndTheirObjects {
    public static void main(String[] args) {
        int number = 1;
        Integer num = 1; // Integer is Object and number will have lot of methods to use
        Integer number1 = null;
        List<Integer> check = new ArrayList<>();
        //if (check!=null) {
            check.add(1);
        //}
        // check.add("Mani"); -- will not be allowed because a String
        //double > Double
        //long > Long
    }
}
