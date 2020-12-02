package com.oracle.practice.basics;

public class PrimitiveCharacterAndBoolean {
    public static void main(String[] args) {
        char test = 'a';
        char test2 = '\u1238';
        char test3  = 123;
        System.out.println("" + test + ' ' + test2 + " " + test3);

        boolean bool = true;
        boolean bool2 = false;

        System.out.println("True Boolean is : "+bool +"\nFalse Boolean : "+bool2);
    }
}
