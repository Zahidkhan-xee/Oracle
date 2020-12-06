package com.oracle.practice.hashmap;

import java.util.HashMap;

public class Advanced {
        public static void main(String[] args) {
                HashMap<Integer, String> currency = new HashMap<>();
                currency.put(1,"one");
                currency.put(2,"Two");
                currency.put(3,"Three");

                currency.putIfAbsent(1, "One Dollar");
                currency.putIfAbsent(2, "One Dollar");
                currency.putIfAbsent(3, "One Dollar");


        }
}
