package com.oracle.practice.Strings;

public class UnderstandingImmutability {

    public static void main(String[] args) {
        String hello  = "hello";
        String hi = "hi";
        String hihello = hello+hi;
        String hihello2 = "hellohi";

        if(hello=="hello")
            System.out.println("hello matched");
        System.out.println(hihello);
        if (hihello == hihello2)
            System.out.println("They are equal.");
        else
            System.out.println("They are not");
        
        String s1 = "hello";
        String s2 = s1.concat("Hi");
        s2.concat("Zahid");

        System.out.println(s1);
        System.out.println(s2);
    }
}
