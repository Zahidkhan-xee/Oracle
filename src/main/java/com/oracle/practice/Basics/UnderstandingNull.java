package com.oracle.practice.Basics;

public class UnderstandingNull {
    static Object object = new Object();
    static Object object2;
    static String myString;
    public static void main(String[] args) {

        String string = null;

        System.out.println("Object1 : " + object);
        System.out.println("Object2 : " + object2);
        System.out.println(myString);
        System.out.println(string);
    }
}
